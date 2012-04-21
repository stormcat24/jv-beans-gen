package org.stormcat.jvbeans.gen.resolver;

import java.util.ArrayList;
import java.util.List;

import org.stormcat.jvbeans.gen.datatype.JvDataSpecGenerator.ItemType;
import org.stormcat.jvbeans.gen.datatype.xls.DataTypeRow;
import org.stormcat.jvbeans.gen.datatype.xls.DataTypeSheet;
import org.stormcat.jvbeans.gen.util.JvBeansGenUtil;

/**
 * @author cocofamous
 */
public class AllResolverGenerator {

    public static void main(String[] args) {
        if (args.length < 1) {
            throw new IllegalArgumentException("format version not specified.");
        }
        JvBeansGenUtil.setVersion(args[0]);
        new AllResolverGenerator().createAllResolver();
    }

    public void createAllResolver() {
        DataTypeSheet dataTypeSheet = JvBeansGenUtil.getSheet(DataTypeSheet.class);
        createResolver(ItemType.STORED, dataTypeSheet.getStoredItems());
        createResolver(ItemType.REALTIME, dataTypeSheet.getRealTimeItems());
        createResolver(ItemType.SETUP, dataTypeSheet.getSetupItems());
    }

    private void createResolver(ItemType itemType, List<DataTypeRow> allList) {
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

        new JvResolverGenerator("org.stormcat.jvbeans.jvlink.definitions.resolver", itemType, lists).createSourceFile();
    }

}
