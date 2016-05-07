/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package ninja.taskbook.model.network.thrift.service;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2016-05-07")
public class ThriftNotification implements org.apache.thrift.TBase<ThriftNotification, ThriftNotification._Fields>, java.io.Serializable, Cloneable, Comparable<ThriftNotification> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ThriftNotification");

  private static final org.apache.thrift.protocol.TField NOTIFICATION_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("notificationId", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField NOTIFICATION_OWNER_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("notificationOwnerId", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField NOTIFICATION_RECEIVER_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("notificationReceiverId", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField NOTIFICATION_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("notificationType", org.apache.thrift.protocol.TType.I32, (short)4);
  private static final org.apache.thrift.protocol.TField NOTIFICATION_DATA_FIELD_DESC = new org.apache.thrift.protocol.TField("notificationData", org.apache.thrift.protocol.TType.STRING, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ThriftNotificationStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ThriftNotificationTupleSchemeFactory());
  }

  public int notificationId; // required
  public int notificationOwnerId; // required
  public int notificationReceiverId; // required
  /**
   * 
   * @see ThriftNotificationType
   */
  public ThriftNotificationType notificationType; // required
  public String notificationData; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    NOTIFICATION_ID((short)1, "notificationId"),
    NOTIFICATION_OWNER_ID((short)2, "notificationOwnerId"),
    NOTIFICATION_RECEIVER_ID((short)3, "notificationReceiverId"),
    /**
     * 
     * @see ThriftNotificationType
     */
    NOTIFICATION_TYPE((short)4, "notificationType"),
    NOTIFICATION_DATA((short)5, "notificationData");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // NOTIFICATION_ID
          return NOTIFICATION_ID;
        case 2: // NOTIFICATION_OWNER_ID
          return NOTIFICATION_OWNER_ID;
        case 3: // NOTIFICATION_RECEIVER_ID
          return NOTIFICATION_RECEIVER_ID;
        case 4: // NOTIFICATION_TYPE
          return NOTIFICATION_TYPE;
        case 5: // NOTIFICATION_DATA
          return NOTIFICATION_DATA;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __NOTIFICATIONID_ISSET_ID = 0;
  private static final int __NOTIFICATIONOWNERID_ISSET_ID = 1;
  private static final int __NOTIFICATIONRECEIVERID_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.NOTIFICATION_ID, new org.apache.thrift.meta_data.FieldMetaData("notificationId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.NOTIFICATION_OWNER_ID, new org.apache.thrift.meta_data.FieldMetaData("notificationOwnerId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.NOTIFICATION_RECEIVER_ID, new org.apache.thrift.meta_data.FieldMetaData("notificationReceiverId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.NOTIFICATION_TYPE, new org.apache.thrift.meta_data.FieldMetaData("notificationType", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, ThriftNotificationType.class)));
    tmpMap.put(_Fields.NOTIFICATION_DATA, new org.apache.thrift.meta_data.FieldMetaData("notificationData", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ThriftNotification.class, metaDataMap);
  }

  public ThriftNotification() {
  }

  public ThriftNotification(
    int notificationId,
    int notificationOwnerId,
    int notificationReceiverId,
    ThriftNotificationType notificationType,
    String notificationData)
  {
    this();
    this.notificationId = notificationId;
    setNotificationIdIsSet(true);
    this.notificationOwnerId = notificationOwnerId;
    setNotificationOwnerIdIsSet(true);
    this.notificationReceiverId = notificationReceiverId;
    setNotificationReceiverIdIsSet(true);
    this.notificationType = notificationType;
    this.notificationData = notificationData;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ThriftNotification(ThriftNotification other) {
    __isset_bitfield = other.__isset_bitfield;
    this.notificationId = other.notificationId;
    this.notificationOwnerId = other.notificationOwnerId;
    this.notificationReceiverId = other.notificationReceiverId;
    if (other.isSetNotificationType()) {
      this.notificationType = other.notificationType;
    }
    if (other.isSetNotificationData()) {
      this.notificationData = other.notificationData;
    }
  }

  public ThriftNotification deepCopy() {
    return new ThriftNotification(this);
  }

  @Override
  public void clear() {
    setNotificationIdIsSet(false);
    this.notificationId = 0;
    setNotificationOwnerIdIsSet(false);
    this.notificationOwnerId = 0;
    setNotificationReceiverIdIsSet(false);
    this.notificationReceiverId = 0;
    this.notificationType = null;
    this.notificationData = null;
  }

  public int getNotificationId() {
    return this.notificationId;
  }

  public ThriftNotification setNotificationId(int notificationId) {
    this.notificationId = notificationId;
    setNotificationIdIsSet(true);
    return this;
  }

  public void unsetNotificationId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __NOTIFICATIONID_ISSET_ID);
  }

  /** Returns true if field notificationId is set (has been assigned a value) and false otherwise */
  public boolean isSetNotificationId() {
    return EncodingUtils.testBit(__isset_bitfield, __NOTIFICATIONID_ISSET_ID);
  }

  public void setNotificationIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __NOTIFICATIONID_ISSET_ID, value);
  }

  public int getNotificationOwnerId() {
    return this.notificationOwnerId;
  }

  public ThriftNotification setNotificationOwnerId(int notificationOwnerId) {
    this.notificationOwnerId = notificationOwnerId;
    setNotificationOwnerIdIsSet(true);
    return this;
  }

  public void unsetNotificationOwnerId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __NOTIFICATIONOWNERID_ISSET_ID);
  }

  /** Returns true if field notificationOwnerId is set (has been assigned a value) and false otherwise */
  public boolean isSetNotificationOwnerId() {
    return EncodingUtils.testBit(__isset_bitfield, __NOTIFICATIONOWNERID_ISSET_ID);
  }

  public void setNotificationOwnerIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __NOTIFICATIONOWNERID_ISSET_ID, value);
  }

  public int getNotificationReceiverId() {
    return this.notificationReceiverId;
  }

  public ThriftNotification setNotificationReceiverId(int notificationReceiverId) {
    this.notificationReceiverId = notificationReceiverId;
    setNotificationReceiverIdIsSet(true);
    return this;
  }

  public void unsetNotificationReceiverId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __NOTIFICATIONRECEIVERID_ISSET_ID);
  }

  /** Returns true if field notificationReceiverId is set (has been assigned a value) and false otherwise */
  public boolean isSetNotificationReceiverId() {
    return EncodingUtils.testBit(__isset_bitfield, __NOTIFICATIONRECEIVERID_ISSET_ID);
  }

  public void setNotificationReceiverIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __NOTIFICATIONRECEIVERID_ISSET_ID, value);
  }

  /**
   * 
   * @see ThriftNotificationType
   */
  public ThriftNotificationType getNotificationType() {
    return this.notificationType;
  }

  /**
   * 
   * @see ThriftNotificationType
   */
  public ThriftNotification setNotificationType(ThriftNotificationType notificationType) {
    this.notificationType = notificationType;
    return this;
  }

  public void unsetNotificationType() {
    this.notificationType = null;
  }

  /** Returns true if field notificationType is set (has been assigned a value) and false otherwise */
  public boolean isSetNotificationType() {
    return this.notificationType != null;
  }

  public void setNotificationTypeIsSet(boolean value) {
    if (!value) {
      this.notificationType = null;
    }
  }

  public String getNotificationData() {
    return this.notificationData;
  }

  public ThriftNotification setNotificationData(String notificationData) {
    this.notificationData = notificationData;
    return this;
  }

  public void unsetNotificationData() {
    this.notificationData = null;
  }

  /** Returns true if field notificationData is set (has been assigned a value) and false otherwise */
  public boolean isSetNotificationData() {
    return this.notificationData != null;
  }

  public void setNotificationDataIsSet(boolean value) {
    if (!value) {
      this.notificationData = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case NOTIFICATION_ID:
      if (value == null) {
        unsetNotificationId();
      } else {
        setNotificationId((Integer)value);
      }
      break;

    case NOTIFICATION_OWNER_ID:
      if (value == null) {
        unsetNotificationOwnerId();
      } else {
        setNotificationOwnerId((Integer)value);
      }
      break;

    case NOTIFICATION_RECEIVER_ID:
      if (value == null) {
        unsetNotificationReceiverId();
      } else {
        setNotificationReceiverId((Integer)value);
      }
      break;

    case NOTIFICATION_TYPE:
      if (value == null) {
        unsetNotificationType();
      } else {
        setNotificationType((ThriftNotificationType)value);
      }
      break;

    case NOTIFICATION_DATA:
      if (value == null) {
        unsetNotificationData();
      } else {
        setNotificationData((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case NOTIFICATION_ID:
      return getNotificationId();

    case NOTIFICATION_OWNER_ID:
      return getNotificationOwnerId();

    case NOTIFICATION_RECEIVER_ID:
      return getNotificationReceiverId();

    case NOTIFICATION_TYPE:
      return getNotificationType();

    case NOTIFICATION_DATA:
      return getNotificationData();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case NOTIFICATION_ID:
      return isSetNotificationId();
    case NOTIFICATION_OWNER_ID:
      return isSetNotificationOwnerId();
    case NOTIFICATION_RECEIVER_ID:
      return isSetNotificationReceiverId();
    case NOTIFICATION_TYPE:
      return isSetNotificationType();
    case NOTIFICATION_DATA:
      return isSetNotificationData();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ThriftNotification)
      return this.equals((ThriftNotification)that);
    return false;
  }

  public boolean equals(ThriftNotification that) {
    if (that == null)
      return false;

    boolean this_present_notificationId = true;
    boolean that_present_notificationId = true;
    if (this_present_notificationId || that_present_notificationId) {
      if (!(this_present_notificationId && that_present_notificationId))
        return false;
      if (this.notificationId != that.notificationId)
        return false;
    }

    boolean this_present_notificationOwnerId = true;
    boolean that_present_notificationOwnerId = true;
    if (this_present_notificationOwnerId || that_present_notificationOwnerId) {
      if (!(this_present_notificationOwnerId && that_present_notificationOwnerId))
        return false;
      if (this.notificationOwnerId != that.notificationOwnerId)
        return false;
    }

    boolean this_present_notificationReceiverId = true;
    boolean that_present_notificationReceiverId = true;
    if (this_present_notificationReceiverId || that_present_notificationReceiverId) {
      if (!(this_present_notificationReceiverId && that_present_notificationReceiverId))
        return false;
      if (this.notificationReceiverId != that.notificationReceiverId)
        return false;
    }

    boolean this_present_notificationType = true && this.isSetNotificationType();
    boolean that_present_notificationType = true && that.isSetNotificationType();
    if (this_present_notificationType || that_present_notificationType) {
      if (!(this_present_notificationType && that_present_notificationType))
        return false;
      if (!this.notificationType.equals(that.notificationType))
        return false;
    }

    boolean this_present_notificationData = true && this.isSetNotificationData();
    boolean that_present_notificationData = true && that.isSetNotificationData();
    if (this_present_notificationData || that_present_notificationData) {
      if (!(this_present_notificationData && that_present_notificationData))
        return false;
      if (!this.notificationData.equals(that.notificationData))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_notificationId = true;
    list.add(present_notificationId);
    if (present_notificationId)
      list.add(notificationId);

    boolean present_notificationOwnerId = true;
    list.add(present_notificationOwnerId);
    if (present_notificationOwnerId)
      list.add(notificationOwnerId);

    boolean present_notificationReceiverId = true;
    list.add(present_notificationReceiverId);
    if (present_notificationReceiverId)
      list.add(notificationReceiverId);

    boolean present_notificationType = true && (isSetNotificationType());
    list.add(present_notificationType);
    if (present_notificationType)
      list.add(notificationType.getValue());

    boolean present_notificationData = true && (isSetNotificationData());
    list.add(present_notificationData);
    if (present_notificationData)
      list.add(notificationData);

    return list.hashCode();
  }

  @Override
  public int compareTo(ThriftNotification other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetNotificationId()).compareTo(other.isSetNotificationId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNotificationId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.notificationId, other.notificationId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetNotificationOwnerId()).compareTo(other.isSetNotificationOwnerId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNotificationOwnerId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.notificationOwnerId, other.notificationOwnerId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetNotificationReceiverId()).compareTo(other.isSetNotificationReceiverId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNotificationReceiverId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.notificationReceiverId, other.notificationReceiverId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetNotificationType()).compareTo(other.isSetNotificationType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNotificationType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.notificationType, other.notificationType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetNotificationData()).compareTo(other.isSetNotificationData());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNotificationData()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.notificationData, other.notificationData);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("ThriftNotification(");
    boolean first = true;

    sb.append("notificationId:");
    sb.append(this.notificationId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("notificationOwnerId:");
    sb.append(this.notificationOwnerId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("notificationReceiverId:");
    sb.append(this.notificationReceiverId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("notificationType:");
    if (this.notificationType == null) {
      sb.append("null");
    } else {
      sb.append(this.notificationType);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("notificationData:");
    if (this.notificationData == null) {
      sb.append("null");
    } else {
      sb.append(this.notificationData);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'notificationId' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'notificationOwnerId' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'notificationReceiverId' because it's a primitive and you chose the non-beans generator.
    if (notificationType == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'notificationType' was not present! Struct: " + toString());
    }
    if (notificationData == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'notificationData' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ThriftNotificationStandardSchemeFactory implements SchemeFactory {
    public ThriftNotificationStandardScheme getScheme() {
      return new ThriftNotificationStandardScheme();
    }
  }

  private static class ThriftNotificationStandardScheme extends StandardScheme<ThriftNotification> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ThriftNotification struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // NOTIFICATION_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.notificationId = iprot.readI32();
              struct.setNotificationIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // NOTIFICATION_OWNER_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.notificationOwnerId = iprot.readI32();
              struct.setNotificationOwnerIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // NOTIFICATION_RECEIVER_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.notificationReceiverId = iprot.readI32();
              struct.setNotificationReceiverIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // NOTIFICATION_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.notificationType = ninja.taskbook.model.network.thrift.service.ThriftNotificationType.findByValue(iprot.readI32());
              struct.setNotificationTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // NOTIFICATION_DATA
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.notificationData = iprot.readString();
              struct.setNotificationDataIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      if (!struct.isSetNotificationId()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'notificationId' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetNotificationOwnerId()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'notificationOwnerId' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetNotificationReceiverId()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'notificationReceiverId' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, ThriftNotification struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(NOTIFICATION_ID_FIELD_DESC);
      oprot.writeI32(struct.notificationId);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(NOTIFICATION_OWNER_ID_FIELD_DESC);
      oprot.writeI32(struct.notificationOwnerId);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(NOTIFICATION_RECEIVER_ID_FIELD_DESC);
      oprot.writeI32(struct.notificationReceiverId);
      oprot.writeFieldEnd();
      if (struct.notificationType != null) {
        oprot.writeFieldBegin(NOTIFICATION_TYPE_FIELD_DESC);
        oprot.writeI32(struct.notificationType.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.notificationData != null) {
        oprot.writeFieldBegin(NOTIFICATION_DATA_FIELD_DESC);
        oprot.writeString(struct.notificationData);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ThriftNotificationTupleSchemeFactory implements SchemeFactory {
    public ThriftNotificationTupleScheme getScheme() {
      return new ThriftNotificationTupleScheme();
    }
  }

  private static class ThriftNotificationTupleScheme extends TupleScheme<ThriftNotification> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ThriftNotification struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI32(struct.notificationId);
      oprot.writeI32(struct.notificationOwnerId);
      oprot.writeI32(struct.notificationReceiverId);
      oprot.writeI32(struct.notificationType.getValue());
      oprot.writeString(struct.notificationData);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ThriftNotification struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.notificationId = iprot.readI32();
      struct.setNotificationIdIsSet(true);
      struct.notificationOwnerId = iprot.readI32();
      struct.setNotificationOwnerIdIsSet(true);
      struct.notificationReceiverId = iprot.readI32();
      struct.setNotificationReceiverIdIsSet(true);
      struct.notificationType = ninja.taskbook.model.network.thrift.service.ThriftNotificationType.findByValue(iprot.readI32());
      struct.setNotificationTypeIsSet(true);
      struct.notificationData = iprot.readString();
      struct.setNotificationDataIsSet(true);
    }
  }

}

