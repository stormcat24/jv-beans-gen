package org.stormcat.jvbeans.gen.datatype;

import java.util.ArrayList;
import java.util.List;

import org.stormcat.jvbeans.gen.datatype.JvDataSpecGenerator.ItemType;
import org.stormcat.jvbeans.gen.datatype.xls.DataTypeRow;
import org.stormcat.jvbeans.gen.datatype.xls.DataTypeSheet;
import org.stormcat.jvbeans.gen.util.JvBeansGenUtil;

/**
 * @author cocofamous
 */
public class AllDataSpecGenerator {

    public static void main(String[] args) {
        if (args.length < 1) {
            throw new IllegalArgumentException("format version not specified.");
        }
        JvBeansGenUtil.setVersion(args[0]);
        new AllDataSpecGenerator().createAllDataSpec();
    }

    public void createAllDataSpec() {
        DataTypeSheet dataTypeSheet = JvBeansGenUtil.getSheet(DataTypeSheet.class);
        createDataSpec(ItemType.STORED, dataTypeSheet.getStoredItems());
        createDataSpec(ItemType.REALTIME, dataTypeSheet.getRealTimeItems());
        createDataSpec(ItemType.SETUP, dataTypeSheet.getSetupItems());
    }

    private void createDataSpec(ItemType itemType, List<DataTypeRow> allList) {
        allList.remove(0);

        List<List<DataTypeRow>> lists = new ArrayList<List<DataTypeRow>>();
        List<DataTypeRow> list = new ArrayList<DataTypeRow>();
        String current = null;
        for (DataTypeRow row : allList) {
            if (current == null) {
                current = row.getDataType();
            } else if (!current.equals(row.getDataType())) {
                lists.add(list);
                list = new ArrayList<DataTypeRow>();
                current = row.getDataType();
            }
            list.add(row);
        }
        lists.add(list);

        for (List<DataTypeRow> l : lists) {
            new JvDataSpecGenerator("org.stormcat.jvbeans.jvlink.definitions.dataspec", itemType, l).createSourceFile();
        }
    }

}
