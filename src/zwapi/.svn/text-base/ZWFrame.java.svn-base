package zwapi;

/**
 *
 * @author David Lemvigh
 * @author Andreas Møller
 */
public class ZWFrame {

    public static final byte SOF = (byte) 0x01; //	start of frame
    public static final byte ACK = (byte) 0x06;	//	acknowledge
    public static final byte NAK = (byte) 0x15; //	not acknowledge
    public static final byte CAN = (byte) 0x18; //      cancel
    public static final byte MAGIC_LEN = 29;
    public static final byte REQUEST = (byte) 0x0;
    public static final byte RESPONSE = (byte) 0x1;
    public static final byte ZW_VERSION = (byte) 0x15;
    public static final byte ZW_MEMORY_GET_ID = (byte) 0x20;
    public static final byte ZW_CLOCK_SET = (byte) 0x30;
    public static final byte TRANSMIT_OPTION_ACK = (byte) 0x01;
    public static final byte TRANSMIT_OPTION_LOW_POWER = (byte) 0x02;
    public static final byte TRANSMIT_OPTION_AUTO_ROUTE = (byte) 0x04;
    public static final byte TRANSMIT_OPTION_FORCE_ROUTE = (byte) 0x08;
    public static final byte TRANSMIT_COMPLETE_OK = (byte) 0x00;
    public static final byte TRANSMIT_COMPLETE_NO_ACK = (byte) 0x01;
    public static final byte TRANSMIT_COMPLETE_FAIL = (byte) 0x02;
    public static final byte TRANSMIT_COMPLETE_NOROUTE = (byte) 0x04;
    public static final byte RECEIVE_STATUS_TYPE_BROAD = (byte) 0x04;
    public static final byte NODE_BROADCAST = (byte) 0xFF;
    public static final byte SERIAL_API_GET_INIT_DATA = (byte) 0x02;
    public static final byte SERIAL_API_GET_CAPABILITIES = (byte) 0x07;
    public static final byte SERIAL_API_SOFT_RESET = (byte) 0x8;
    public static final byte APPLICATION_COMMAND_HANDLER = (byte) 0x04;
    public static final byte ZW_APPLICATION_UPDATE = (byte) 0x49;
    public static final byte ZW_SET_DEFAULT = (byte) 0x42;
    public static final byte ZW_REPLICATION_COMMAND_COMPLETE = (byte) 0x44;
    public static final byte ZW_GET_NODE_PROTOCOL_INFO = (byte) 0x41;
    public static final byte ZW_REQUEST_NODE_NEIGHBOR_UPDATE = (byte) 0x48;
    public static final byte ZW_SEND_DATA = (byte) 0x13;
    public static final byte ZW_SEND_DATA_MULTI = (byte) 0x14;
    public static final byte ZW_SET_LEARN_MODE = (byte) 0x50;
    public static final byte ZW_ENABLE_SUC = (byte) 0x52;
    public static final byte ZW_SET_SUC_NODE_ID = (byte) 0x54;
    public static final byte ZW_GET_SUC_NODE_ID = (byte) 0x56;
    public static final byte ZW_ADD_NODE_TO_NETWORK = (byte) 0x4a;
    public static final byte ZW_REMOVE_NODE_FROM_NETWORK = (byte) 0x4b;
    public static final byte ZW_REMOVE_FAILED_NODE_ID = (byte) 0x61;
    public static final byte ZW_REQUEST_NODE_INFO = (byte) 0x60;
    /** add node to network parameters */
    public static final byte ADD_NODE_ANY = (byte) 0x01;
    public static final byte ADD_NODE_CONTROLLER = (byte) 0x02;
    public static final byte ADD_NODE_SLAVE = (byte) 0x03;
    public static final byte ADD_NODE_EXISTING = (byte) 0x04;
    public static final byte ADD_NODE_STOP = (byte) 0x05;
    public static final byte ADD_NODE_STOP_FAILED = (byte) 0x06;
    /** add node to network options */
    public static final byte ADD_NODE_OPTION_MASK = (byte) 0x0F;
    public static final byte ADD_NODE_OPTION_HIGH_POWER = (byte) 0x80;
    public static final byte ADD_NODE_OPTION_NETWORK_WIDE = (byte) 0x40;
    /** add node to network callback states */
    public static final byte ADD_NODE_STATUS_LEARN_READY = (byte) 0x01;
    public static final byte ADD_NODE_STATUS_NODE_FOUND = (byte) 0x02;
    public static final byte ADD_NODE_STATUS_ADDING_SLAVE = (byte) 0x03;
    public static final byte ADD_NODE_STATUS_ADDING_CONTROLLER = (byte) 0x04;
    public static final byte ADD_NODE_STATUS_PROTOCOL_DONE = (byte) 0x05;
    public static final byte ADD_NODE_STATUS_DONE = (byte) 0x06;
    public static final byte ADD_NODE_STATUS_FAILED = (byte) 0x07;
    public static final byte REMOVE_NODE_ANY = (byte) 0x01;
    public static final byte REMOVE_NODE_STOP = (byte) 0x05;
    public static final byte REMOVE_NODE_STATUS_LEARN_READY = (byte) 0x01;
    public static final byte REMOVE_NODE_STATUS_NODE_FOUND = (byte) 0x02;
    public static final byte REMOVE_NODE_STATUS_ADDING_SLAVE = (byte) 0x03;
    public static final byte REMOVE_NODE_STATUS_ADDING_CONTROLLER = (byte) 0x04;
    public static final byte REMOVE_NODE_STATUS_PROTOCOL_DONE = (byte) 0x05;
    public static final byte REMOVE_NODE_STATUS_DONE = (byte) 0x06;
    public static final byte REMOVE_NODE_STATUS_FAILED = (byte) 0x07;
    public static final byte ZW_SUC_FUNC_BASIC_SUC = (byte) 0x00;
    public static final byte ZW_SUC_FUNC_NODEID_SERVER = (byte) 0x01;
    public static final byte ZW_ASSIGN_RETURN_ROUTE = (byte) 0x46;
    public static final byte UPDATE_STATE_NODE_INFO_RECEIVED = (byte) 0x84;
    public static final byte UPDATE_STATE_NODE_INFO_REQ_FAILED = (byte) 0x81;
    public static final byte UPDATE_STATE_DELETE_DONE = (byte) 0x20;
    public static final byte UPDATE_STATE_NEW_ID_ASSIGNED = (byte) 0x40;
    public static final byte BASIC_TYPE_CONTROLLER = (byte) 0x01;
    public static final byte BASIC_TYPE_STATIC_CONTROLLER = (byte) 0x02;
    public static final byte BASIC_TYPE_SLAVE = (byte) 0x03;
    public static final byte BASIC_TYPE_ROUTING_SLAVE = (byte) 0x04;
    public static final byte GENERIC_TYPE_GENERIC_CONTROLLER = (byte) 0x01;
    public static final byte GENERIC_TYPE_STATIC_CONTROLLER = (byte) 0x02;
    public static final byte GENERIC_TYPE_AV_CONTROL_POINT = (byte) 0x03;
    public static final byte GENERIC_TYPE_DISPLAY = (byte) 0x06;
    public static final byte GENERIC_TYPE_GARAGE_DOOR = (byte) 0x07;
    public static final byte GENERIC_TYPE_THERMOSTAT = (byte) 0x08;
    public static final byte GENERIC_TYPE_WINDOW_COVERING = (byte) 0x09;
    public static final byte GENERIC_TYPE_REPEATER_SLAVE = (byte) 0x0F;
    public static final byte GENERIC_TYPE_SWITCH_BINARY = (byte) 0x10;
    public static final byte GENERIC_TYPE_SWITCH_MULTILEVEL = (byte) 0x11;
    public static final byte GENERIC_TYPE_SWITCH_REMOTE = (byte) 0x12;
    public static final byte GENERIC_TYPE_SWITCH_TOGGLE = (byte) 0x13;
    public static final byte GENERIC_TYPE_SENSOR_BINARY = (byte) 0x20;
    public static final byte GENERIC_TYPE_SENSOR_MULTILEVEL = (byte) 0x21;
    public static final byte GENERIC_TYPE_WATER_CONTROL = (byte) 0x22;
    public static final byte GENERIC_TYPE_METER_PULSE = (byte) 0x30;
    public static final byte GENERIC_TYPE_ENTRY_CONTROL = (byte) 0x40;
    public static final byte GENERIC_TYPE_SEMI_INTEROPERABLE = (byte) 0x50;
    public static final byte GENERIC_TYPE_NON_INTEROPERABLE = (byte) 0xFF;
    public static final byte COMMAND_CLASS_MARK = (byte) 0xef;
    public static final byte COMMAND_CLASS_BASIC = (byte) 0x20;
    public static final byte BASIC_SET = (byte) 0x01;
    public static final byte BASIC_GET = (byte) 0x02;
    public static final byte BASIC_REPORT = (byte) 0x03;
    public static final byte COMMAND_CLASS_VERSION = (byte) 0x86;
    public static final byte VERSION_GET = (byte) 0x11;
    public static final byte VERSION_REPORT = (byte) 0x12;
    public static final byte COMMAND_CLASS_BATTERY = (byte) 0x80;
    public static final byte BATTERY_REPORT = (byte) 0x03;
    public static final byte COMMAND_CLASS_WAKE_UP = (byte) 0x84;
    public static final byte WAKE_UP_INTERVAL_SET = (byte) 0x04;
    public static final byte WAKE_UP_NOTIFICATION = (byte) 0x07;
    public static final byte WAKE_UP_NO_MORE_INFORMATION = (byte) 0x08;
    public static final byte COMMAND_CLASS_CONTROLLER_REPLICATION = (byte) 0x21;
    public static final byte CTRL_REPLICATION_TRANSFER_GROUP = (byte) 0x31;
    public static final byte COMMAND_CLASS_SWITCH_MULTILEVEL = (byte) 0x26;
    public static final byte SWITCH_MULTILEVEL_SET = (byte) 0x01;
    public static final byte SWITCH_MULTILEVEL_GET = (byte) 0x02;
    public static final byte SWITCH_MULTILEVEL_REPORT = (byte) 0x03;
    public static final byte COMMAND_CLASS_SWITCH_ALL = (byte) 0x27;
    public static final byte SWITCH_ALL_ON = (byte) 0x04;
    public static final byte SWITCH_ALL_OFF = (byte) 0x05;
    public static final byte COMMAND_CLASS_SENSOR_BINARY = (byte) 0x30;
    public static final byte SENSOR_BINARY_REPORT = (byte) 0x03;
    public static final byte COMMAND_CLASS_SENSOR_MULTILEVEL = (byte) 0x31;
    public static final byte SENSOR_MULTILEVEL_VERSION = (byte) 0x01;
    public static final byte SENSOR_MULTILEVEL_GET = (byte) 0x04;
    public static final byte SENSOR_MULTILEVEL_REPORT = (byte) 0x05;
    public static final byte SENSOR_MULTILEVEL_REPORT_TEMPERATURE = (byte) 0x01;
    public static final byte SENSOR_MULTILEVEL_REPORT_GENERAL_PURPOSE_VALUE = (byte) 0x02;
    public static final byte SENSOR_MULTILEVEL_REPORT_LUMINANCE = (byte) 0x03;
    public static final byte SENSOR_MULTILEVEL_REPORT_POWER = (byte) 0x04;
    public static final byte SENSOR_MULTILEVEL_REPORT_RELATIVE_HUMIDITY = (byte) 0x05;
    public static final byte SENSOR_MULTILEVEL_REPORT_CO2_LEVEL = (byte) 0x11;
    public static final byte SENSOR_MULTILEVEL_REPORT_SIZE_MASK = (byte) 0x07;
    public static final byte SENSOR_MULTILEVEL_REPORT_SCALE_MASK = (byte) 0x18;
    public static final byte SENSOR_MULTILEVEL_REPORT_SCALE_SHIFT = (byte) 0x03;
    public static final byte SENSOR_MULTILEVEL_REPORT_PRECISION_MASK = (byte) 0xe0;
    public static final byte SENSOR_MULTILEVEL_REPORT_PRECISION_SHIFT = (byte) 0x5;
    public static final byte COMMAND_CLASS_ALARM = (byte) 0x71;
    public static final byte ALARM_REPORT = (byte) 0x05;
    public static final byte COMMAND_CLASS_MULTI_CMD = (byte) 0x8F;
    public static final byte MULTI_CMD_VERSION = (byte) 0x01;
    public static final byte MULTI_CMD_ENCAP = (byte) 0x01;
    public static final byte MULTI_CMD_RESPONSE_ENCAP = (byte) 0x02;
    public static final byte COMMAND_CLASS_CLIMATE_CONTROL_SCHEDULE = (byte) 0x46;
    public static final byte SCHEDULE_SET = (byte) 0x01;
    public static final byte SCHEDULE_GET = (byte) 0x02;
    public static final byte SCHEDULE_CHANGED_GET = (byte) 0x04;
    public static final byte SCHEDULE_CHANGED_REPORT = (byte) 0x05;
    public static final byte SCHEDULE_OVERRIDE_GET = (byte) 0x07;
    public static final byte SCHEDULE_OVERRIDE_REPORT = (byte) 0x08;
    public static final byte COMMAND_CLASS_CLOCK = (byte) 0x81;
    public static final byte CLOCK_GET = (byte) 0x05;
    public static final byte CLOCK_SET = (byte) 0x04;
    public static final byte CLOCK_REPORT = (byte) 0x06;
    public static final byte COMMAND_CLASS_ASSOCIATION = (byte) 0x85;
    public static final byte ASSOCIATION_SET = (byte) 0x01;
    public static final byte ASSOCIATION_GET = (byte) 0x02;
    public static final byte ASSOCIATION_REPORT = (byte) 0x03;
    public static final byte ASSOCIATION_REMOVE = (byte) 0x04;
    public static final byte COMMAND_CLASS_CONFIGURATION = (byte) 0x70;
    public static final byte CONFIGURATION_SET = (byte) 0x04;
    public static final byte CONFIGURATION_GET = (byte) 0x05;
    public static final byte COMMAND_CLASS_MANUFACTURER_SPECIFIC = (byte) 0x72;
    public static final byte MANUFACTURER_SPECIFIC_GET = (byte) 0x04;
    public static final byte MANUFACTURER_SPECIFIC_REPORT = (byte) 0x05;
    public static final byte COMMAND_CLASS_APPLICATION_STATUS = (byte) 0x22;
    public static final byte COMMAND_CLASS_ASSOCIATION_COMMAND_CONFIGURATION = (byte) 0x9B;
    public static final byte COMMAND_CLASS_AV_CONTENT_DIRECTORY_MD = (byte) 0x95;
    public static final byte COMMAND_CLASS_AV_CONTENT_SEARCH_MD = (byte) 0x97;
    public static final byte COMMAND_CLASS_AV_RENDERER_STATUS = (byte) 0x96;
    public static final byte COMMAND_CLASS_AV_TAGGING_MD = (byte) 0x99;
    public static final byte COMMAND_CLASS_BASIC_WINDOW_COVERING = (byte) 0x50;
    public static final byte COMMAND_CLASS_CHIMNEY_FAN = (byte) 0x2A;
    public static final byte COMMAND_CLASS_COMPOSITE = (byte) 0x8D;
    public static final byte COMMAND_CLASS_DOOR_LOCK = (byte) 0x62;
    public static final byte COMMAND_CLASS_ENERGY_PRODUCTION = (byte) 0x90;
    public static final byte COMMAND_CLASS_FIRMWARE_UPDATE_MD = (byte) 0x7a;
    public static final byte COMMAND_CLASS_GEOGRAPHIC_LOCATION = (byte) 0x8C;
    public static final byte COMMAND_CLASS_GROUPING_NAME = (byte) 0x7B;
    public static final byte COMMAND_CLASS_HAIL = (byte) 0x82;
    public static final byte COMMAND_CLASS_INDICATOR = (byte) 0x87;
    public static final byte COMMAND_CLASS_IP_CONFIGURATION = (byte) 0x9A;
    public static final byte COMMAND_CLASS_LANGUAGE = (byte) 0x89;
    public static final byte COMMAND_CLASS_LOCK = (byte) 0x76;
    public static final byte COMMAND_CLASS_MANUFACTURER_PROPRIETARY = (byte) 0x91;
    public static final byte COMMAND_CLASS_METER_PULSE = (byte) 0x35;
    public static final byte COMMAND_CLASS_METER = (byte) 0x32;
    public static final byte METER_GET = (byte) 0x01;
    public static final byte METER_REPORT = (byte) 0x02;
    public static final byte METER_REPORT_ELECTRIC_METER = (byte) 0x01;
    public static final byte METER_REPORT_GAS_METER = (byte) 0x02;
    public static final byte METER_REPORT_WATER_METER = (byte) 0x03;
    public static final byte METER_REPORT_SIZE_MASK = (byte) 0x07;
    public static final byte METER_REPORT_SCALE_MASK = (byte) 0x18;
    public static final byte METER_REPORT_SCALE_SHIFT = (byte) 0x03;
    public static final byte METER_REPORT_PRECISION_MASK = (byte) 0xe0;
    public static final byte METER_REPORT_PRECISION_SHIFT = (byte) 0x05;
    public static final byte COMMAND_CLASS_MTP_WINDOW_COVERING = (byte) 0x51;
    public static final byte COMMAND_CLASS_MULTI_INSTANCE_ASSOCIATION = (byte) 0x8E;
    public static final byte COMMAND_CLASS_MULTI_INSTANCE = (byte) 0x60;
    public static final byte MULTI_INSTANCE_VERSION = (byte) 0x01;
    public static final byte MULTI_INSTANCE_GET = (byte) 0x04;
    public static final byte MULTI_INSTANCE_CMD_ENCAP = (byte) 0x6;
    public static final byte MULTI_INSTANCE_REPORT = (byte) 0x05;
    public static final byte COMMAND_CLASS_NO_OPERATION = (byte) 0x00;
    public static final byte COMMAND_CLASS_NODE_NAMING = (byte) 0x77;
    public static final byte COMMAND_CLASS_NON_INTEROPERABLE = (byte) 0xf0;
    public static final byte COMMAND_CLASS_POWERLEVEL = (byte) 0x73;
    public static final byte COMMAND_CLASS_PROPRIETARY = (byte) 0x88;
    public static final byte COMMAND_CLASS_PROTECTION = (byte) 0x75;
    public static final byte COMMAND_CLASS_REMOTE_ASSOCIATION_ACTIVATE = (byte) 0x7c;
    public static final byte COMMAND_CLASS_REMOTE_ASSOCIATION = (byte) 0x7d;
    public static final byte COMMAND_CLASS_SCENE_ACTIVATION = (byte) 0x2b;
    public static final byte COMMAND_CLASS_SCENE_ACTUATOR_CONF = (byte) 0x2C;
    public static final byte COMMAND_CLASS_SCENE_CONTROLLER_CONF = (byte) 0x2D;
    public static final byte COMMAND_CLASS_SCREEN_ATTRIBUTES = (byte) 0x93;
    public static final byte COMMAND_CLASS_SCREEN_MD = (byte) 0x92;
    public static final byte COMMAND_CLASS_SECURITY = (byte) 0x98;
    public static final byte COMMAND_CLASS_SENSOR_ALARM = (byte) 0x9C;
    public static final byte COMMAND_CLASS_SENSOR_CONFIGURATION = (byte) 0x9E;
    public static final byte COMMAND_CLASS_SILENCE_ALARM = (byte) 0x9d;
    public static final byte COMMAND_CLASS_SIMPLE_AV_CONTROL = (byte) 0x94;
    public static final byte COMMAND_CLASS_SWITCH_BINARY = (byte) 0x25;
    public static final byte COMMAND_CLASS_SWITCH_TOGGLE_BINARY = (byte) 0x28;
    public static final byte COMMAND_CLASS_SWITCH_TOGGLE_MULTILEVEL = (byte) 0x29;
    public static final byte COMMAND_CLASS_THERMOSTAT_FAN_MODE = (byte) 0x44;
    public static final byte THERMOSTAT_FAN_MODE_VERSION = (byte) 0x01;
    public static final byte THERMOSTAT_FAN_MODE_GET = (byte) 0x02;
    public static final byte THERMOSTAT_FAN_MODE_REPORT = (byte) 0x03;
    public static final byte THERMOSTAT_FAN_MODE_SET = (byte) 0x01;
    public static final byte THERMOSTAT_FAN_MODE_SUPPORTED_GET = (byte) 0x04;
    public static final byte THERMOSTAT_FAN_MODE_SUPPORTED_REPORT = (byte) 0x05;
    public static final byte THERMOSTAT_FAN_MODE_REPORT_FAN_MODE_MASK = (byte) 0x0F;
    public static final byte THERMOSTAT_FAN_MODE_REPORT_RESERVED_MASK = (byte) 0xf0;
    public static final byte THERMOSTAT_FAN_MODE_REPORT_RESERVED_SHIFT = (byte) 0x04;
    public static final byte THERMOSTAT_FAN_MODE_SET_FAN_MODE_MASK = (byte) 0x0F;
    public static final byte THERMOSTAT_FAN_MODE_SET_RESERVED_MASK = (byte) 0xF0;
    public static final byte THERMOSTAT_FAN_MODE_SET_RESERVED_SHIFT = (byte) 0x04;
    public static final byte COMMAND_CLASS_THERMOSTAT_FAN_STATE = (byte) 0x45;
    public static final byte COMMAND_CLASS_THERMOSTAT_HEATING = (byte) 0x38;
    public static final byte COMMAND_CLASS_THERMOSTAT_MODE = (byte) 0x40;
    public static final byte THERMOSTAT_MODE_VERSION = (byte) 0x01;
    public static final byte THERMOSTAT_MODE_GET = (byte) 0x02;
    public static final byte THERMOSTAT_MODE_REPORT = (byte) 0x03;
    public static final byte THERMOSTAT_MODE_SET = (byte) 0x01;
    public static final byte THERMOSTAT_MODE_SUPPORTED_GET = (byte) 0x04;
    public static final byte THERMOSTAT_MODE_SUPPORTED_REPORT = (byte) 0x05;
    public static final byte COMMAND_CLASS_THERMOSTAT_OPERATING_STATE = (byte) 0x42;
    public static final byte COMMAND_CLASS_THERMOSTAT_SETBACK = (byte) 0x47;
    public static final byte COMMAND_CLASS_THERMOSTAT_SETPOINT = (byte) 0x43;
    public static final byte THERMOSTAT_SETPOINT_VERSION = (byte) 0x01;
    public static final byte THERMOSTAT_SETPOINT_GET = (byte) 0x02;
    public static final byte THERMOSTAT_SETPOINT_REPORT = (byte) 0x03;
    public static final byte THERMOSTAT_SETPOINT_SET = (byte) 0x01;
    public static final byte THERMOSTAT_SETPOINT_SUPPORTED_GET = (byte) 0x04;
    public static final byte THERMOSxTAT_SETPOINT_SUPPORTED_REPORT = (byte) 0x05;
    public static final byte THERMOSTAT_SETPOINT_GET_SETPOINT_TYPE_MASK = (byte) 0x0F;
    public static final byte THERMOSTAT_SETPOINT_GET_RESERVED_MASK = (byte) 0xf0;
    public static final byte THERMOSTAT_SETPOINT_GET_RESERVED_SHIFT = (byte) 0x04;
    public static final byte THERMOSTAT_SETPOINT_REPORT_SETPOINT_TYPE_MASK = (byte) 0xF;
    public static final byte THERMOSTAT_SETPOINT_REPORT_RESERVED_MASK = (byte) 0xf0;
    public static final byte THERMOSTAT_SETPOINT_REPORT_RESERVED_SHIFT = (byte) 0x04;
    public static final byte THERMOSTAT_SETPOINT_REPORT_SIZE_MASK = (byte) 0x07;
    public static final byte THERMOSTAT_SETPOINT_REPORT_SCALE_MASK = (byte) 0x18;
    public static final byte THERMOSTAT_SETPOINT_REPORT_SCALE_SHIFT = (byte) 0x3;
    public static final byte THERMOSTAT_SETPOINT_REPORT_PRECISION_MASK = (byte) 0xe0;
    public static final byte THERMOSTAT_SETPOINT_REPORT_PRECISION_SHIFT = (byte) 0x05;
    public static final byte THERMOSTAT_SETPOINT_SET_SETPOINT_TYPE_MASK = (byte) 0x0F;
    public static final byte THERMOSTAT_SETPOINT_SET_RESERVED_MASK = (byte) 0xF0;
    public static final byte THERMOSTAT_SETPOINT_SET_RESERVED_SHIFT = (byte) 0x04;
    public static final byte THERMOSTAT_SETPOINT_SET_SIZE_MASK = (byte) 0x07;
    public static final byte THERMOSTAT_SETPOINT_SET_SCALE_MASK = (byte) 0x18;
    public static final byte THERMOSTAT_SETPOINT_SET_SCALE_SHIFT = (byte) 0x03;
    public static final byte THERMOSTAT_SETPOINT_SET_PRECISION_MASK = (byte) 0xE0;
    public static final byte THERMOSTAT_SETPOINT_SET_PRECISION_SHIFT = (byte) 0x05;
    public static final byte COMMAND_CLASS_TIME_PARAMETERS = (byte) 0x8B;
    public static final byte COMMAND_CLASS_TIME = (byte) 0x8a;
    public static final byte COMMAND_CLASS_USER_CODE = (byte) 0x63;
    public static final byte COMMAND_CLASS_ZIP_ADV_CLIENT = (byte) 0x34;
    public static final byte COMMAND_CLASS_ZIP_ADV_SERVER = (byte) 0x33;
    public static final byte COMMAND_CLASS_ZIP_ADV_SERVICES = (byte) 0x2F;
    public static final byte COMMAND_CLASS_ZIP_CLIENT = (byte) 0x2e;
    public static final byte COMMAND_CLASS_ZIP_SERVER = (byte) 0x24;
    public static final byte COMMAND_CLASS_ZIP_SERVICES = (byte) 0x23;
    public static final byte ZW_SEND_NODE_INFO = (byte) 0x12;
    public static final byte LEARN_NODE_STATE_OFF = (byte) 0x00;
    public static final byte LEARN_NODE_STATE_NEW = (byte) 0x01;
    public static final byte LEARN_NODE_STATE_UPDATE = (byte) 0x02;
    public static final byte LEARN_NODE_STATE_DELETE = (byte) 0x03;
    public static final byte ZW_SET_LEARN_MODE_CLASSIC = (byte) 0x01;
    public static final byte ZW_SET_LEARN_MODE_DISABLE = (byte) 0x00;
    public static final byte ZW_SET_LEARN_MODE_NWI = (byte) 0x02;
    public byte length;
    public byte type;
    public byte command;
    public byte[] payload;
    public byte checksum;
    public int count = -1;
    public static byte[] txOptions = {0x01, 0x00, 0x00};
    public boolean hasFuncID;
    private static byte funcCount = (byte) (Math.random() * 0xFF);
    public byte funcID;

    //private static Map<Byte><String> cmdClass = new HashMap<Byte><String>();

    static {
        
    }

    public ZWFrame(byte type, byte command, byte[] payload) {
        this.type = type;
        this.command = command;
        this.payload = payload;

        this.length = 3;
        if (payload != null) {
            this.length += payload.length;
        }
        if (this.txOptions != null) {
            this.length += txOptions.length;
        }
        this.checksum = checksum();
    }

    public ZWFrame(byte length, byte type, byte command, byte[] payload, byte checksum) {
        this.length = length;
        this.type = type;
        this.command = command;
        this.payload = payload;
        this.checksum = checksum;
    }

    public ZWFrame(byte type, byte command, byte[] payload, boolean hasFuncID) {
        this(type, command, payload);

        this.hasFuncID = hasFuncID;
        if (hasFuncID)
        {
            this.funcID = funcCount++;
            this.length++;
            this.checksum = checksum();
        }
    }
    public ZWFrame(byte length, byte type, byte command, byte[] payload, byte checksum, boolean hasFuncID) {
        this(length, type, command, payload, checksum);

        this.hasFuncID = hasFuncID;
        if (hasFuncID)
        {
            this.funcID = funcCount++;
            this.length++;
            this.checksum = checksum();
        }
    }


    public ZWFrame() {
        this.count = 0;
    }

    public boolean digest(byte data) {
        if (count < 0) {
            throw new IllegalArgumentException("ZMessage is complete, and cannot digest more data");
        } else if (count == 0) {
            this.length = data;
            this.txOptions = null;
            if (length > 3) {
                this.payload = new byte[data - 3];
            } else {
                this.payload = null;
            }
        } else if (count == 1) {
            this.type = data;
        } else if (count == 2) {
            this.command = data;
//        } else if (count == length-1) {
//            this.hasFuncID = true;
//            this.funcID = data;
        } else if (count == length) {
            this.checksum = data;
            count = -1;
            return true;
        } else if (count < length) {
            this.payload[count - 3] = data;
        }
        count++;
        return false;
    }

    public byte checksum() {
        short check = (byte) 0xff;
        check ^= length;
        check ^= command;
        if (payload != null) {
            for (int i = 0; i < payload.length; i++) {
                check ^= payload[i];
            }
        }
        if (txOptions != null) {
            for (int i = 0; i < txOptions.length; i++) {
                check ^= txOptions[i];
            }
        }
        check ^= funcID;
        return (byte) check;
    }

    public boolean verifyChecksum() {
        return this.checksum == checksum();
    }

    public void setTxOptions() {
        setTxOptions(new byte[]{0x00, 0x00, 0x00});
    }

    public void setTxOptions(byte[] flags) {
        //find length of new and old txOptions
        int len1 = (txOptions != null) ? txOptions.length : 0;
        int len2 = (flags != null) ? flags.length : 0;

        this.txOptions = flags;
        this.length += (len2 - len1); // update length
        this.checksum = checksum();
    }

    public byte[] getBytes() {
        int len = 5;
        if (payload != null) {
            len += payload.length;
        }
        if (txOptions != null) {
            len += txOptions.length;
        }
        if (hasFuncID) {
            len++;
        }

        //int len = (payload == null) ? 5 : 5 + payload.length;
        byte[] bytes = new byte[len];
        int index = 0;
        bytes[index++] = SOF;
        bytes[index++] = length;
        bytes[index++] = type;
        bytes[index++] = command;
        if (payload != null) {
            System.arraycopy(payload, 0, bytes, index, payload.length);
            index += payload.length;
        }
        if (txOptions != null) {
            System.arraycopy(txOptions, 0, bytes, index, txOptions.length);
            index += txOptions.length;
        }

        if (hasFuncID) {
            bytes[index++] = funcID;
        }
        bytes[index++] = checksum;
        return bytes;
    }

    public String getPayloadBytesString() {
        if (payload == null) {
            return "";
        }

        StringBuilder sb = new StringBuilder(5 * payload.length);
        sb.append(String.format("0x%02X", payload[0]));
        for (int i = 1; i < payload.length; i++) {
            sb.append(String.format(",0x%02X", payload[i]));
        }

        return sb.toString();

    }

    public static String bytes2string(byte[] bytes) {
        if (bytes == null) {
            return "";
        }

        StringBuilder sb = new StringBuilder(5 * bytes.length);
        sb.append(String.format("0x%02X", bytes[0]));
        for (int i = 1; i < bytes.length; i++) {
            sb.append(String.format(",0x%02X", bytes[i]));
        }

        return sb.toString();

    }

    public String getCmdClassName() {
        return "";
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append(String.format("Length: %d\n", this.length));
        sb.append(String.format("Type: 0x%02X\n", this.type));
        sb.append(String.format("Command: 0x%02X\n", this.command));
        if (this.payload != null) {
            sb.append(String.format("Payload: %s\n", getPayloadBytesString()));
        }
        if (this.hasFuncID) {
            sb.append(String.format("FuncID: 0x%02X\n", this.funcID));
        }
        if (this.txOptions != null) {
            sb.append(String.format("txOptions: %s\n", bytes2string(this.txOptions)));
        }
        sb.append(String.format("Checksum: 0x%02X\n", this.checksum));
        if(verifyChecksum()) {
            sb.append("checksum is valid\n");
        }
        sb.append(bytes2string(getBytes())+"\n");
        return sb.toString();
    }

    public static void main(String[] args) {
    }
}
