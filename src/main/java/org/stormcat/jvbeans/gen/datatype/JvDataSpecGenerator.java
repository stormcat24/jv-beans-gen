package org.stormcat.jvbeans.gen.datatype;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.stormcat.commons.io.PropertyUtil;
import org.stormcat.commons.lang.StringUtil;
import org.stormcat.jvbeans.gen.BaseGenerator;
import org.stormcat.jvbeans.gen.VelocityContainer;
import org.stormcat.jvbeans.gen.datatype.xls.DataTypeRow;

/**
 * @author cocofamous
 */
public class JvDataSpecGenerator extends BaseGenerator {

    public enum ItemType {
        STORED, REALTIME, SETUP
    };

    private String className;

    private ItemType itemType;

    private List<DataTypeRow> list;

    public JvDataSpecGenerator(String packageName, ItemType itemType, List<DataTypeRow> list) {
        super(packageName);
        this.itemType = itemType;
        this.className = createClassName(list.get(0).getDataType());
        this.list = list;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getClassName() {
        return className;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getJavadoc() {
        return "";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getTemplate() {
        return "src/main/resources/org/stormcat/jvbeans/gen/datatype/dataspec.vm";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected void prepare(VelocityContainer container) {
        List<Map<String, String>> recordTypeList = new ArrayList<Map<String, String>>();
        for (DataTypeRow row : list) {
            Map<String, String> map = new HashMap<String, String>();
            map.put("recordTypeId", row.getRecordTypeId());
            map.put("dtoType", getDtoType(row.getRecordTypeId()));
            recordTypeList.add(map);
        }

        container.addParameter("dataType", list.get(0).getDataType());
        container.addParameter("dataName", list.get(0).getDataName().replace("\n", ""));
        container.addParameter("recordTypeList", recordTypeList);
        container.addParameter("dataSpecType", getValue("dataSpec.type"));
        container.addParameter("openCondition", getValue("openCondition.type"));
    }

    private String createClassName(String dataType) {
        StringBuilder sb = new StringBuilder("_");
        if (dataType.equals("DIFF")) {
            if (itemType.equals(ItemType.STORED)) {
                sb.append("Stored");
            } else if (itemType.equals(ItemType.SETUP)) {
                sb.append("Setup");
            }
        }
        sb.append(StringUtil.capitalize(dataType.toLowerCase()));
        return sb.toString();
    }

    private String getValue(String key) {
        return PropertyUtil.getValue(String.format("%s.%s", "org.stormcat.jvbeans.gen.datatype", itemType.name()), key);
    }

    private String getDtoType(String recordTypeId) {
        return "org.stormcat.jvbeans.jvlink.definitions.dto."
                + PropertyUtil.getValue(String.format("%s.%s", "org.stormcat.jvbeans.gen.format", recordTypeId),
                        "dto.name");
    }

}
