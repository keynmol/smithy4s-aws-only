package com.amazonaws.comprehend

import smithy4s.Enumeration
import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.EnumTag
import smithy4s.schema.Schema.enumeration

sealed abstract class PiiEntityType(_value: String, _name: String, _intValue: Int, _hints: Hints) extends Enumeration.Value {
  override type EnumType = PiiEntityType
  override val value: String = _value
  override val name: String = _name
  override val intValue: Int = _intValue
  override val hints: Hints = _hints
  override def enumeration: Enumeration[EnumType] = PiiEntityType
  @inline final def widen: PiiEntityType = this
}
object PiiEntityType extends Enumeration[PiiEntityType] with ShapeTag.Companion[PiiEntityType] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "PiiEntityType")

  val hints: Hints = Hints(
    alloy.OpenEnum(),
  ).lazily

  case object BANK_ACCOUNT_NUMBER extends PiiEntityType("BANK_ACCOUNT_NUMBER", "BANK_ACCOUNT_NUMBER", 0, Hints.empty)
  case object BANK_ROUTING extends PiiEntityType("BANK_ROUTING", "BANK_ROUTING", 1, Hints.empty)
  case object CREDIT_DEBIT_NUMBER extends PiiEntityType("CREDIT_DEBIT_NUMBER", "CREDIT_DEBIT_NUMBER", 2, Hints.empty)
  case object CREDIT_DEBIT_CVV extends PiiEntityType("CREDIT_DEBIT_CVV", "CREDIT_DEBIT_CVV", 3, Hints.empty)
  case object CREDIT_DEBIT_EXPIRY extends PiiEntityType("CREDIT_DEBIT_EXPIRY", "CREDIT_DEBIT_EXPIRY", 4, Hints.empty)
  case object PIN extends PiiEntityType("PIN", "PIN", 5, Hints.empty)
  case object EMAIL extends PiiEntityType("EMAIL", "EMAIL", 6, Hints.empty)
  case object ADDRESS extends PiiEntityType("ADDRESS", "ADDRESS", 7, Hints.empty)
  case object NAME extends PiiEntityType("NAME", "NAME", 8, Hints.empty)
  case object PHONE extends PiiEntityType("PHONE", "PHONE", 9, Hints.empty)
  case object SSN extends PiiEntityType("SSN", "SSN", 10, Hints.empty)
  case object DATE_TIME extends PiiEntityType("DATE_TIME", "DATE_TIME", 11, Hints.empty)
  case object PASSPORT_NUMBER extends PiiEntityType("PASSPORT_NUMBER", "PASSPORT_NUMBER", 12, Hints.empty)
  case object DRIVER_ID extends PiiEntityType("DRIVER_ID", "DRIVER_ID", 13, Hints.empty)
  case object URL extends PiiEntityType("URL", "URL", 14, Hints.empty)
  case object AGE extends PiiEntityType("AGE", "AGE", 15, Hints.empty)
  case object USERNAME extends PiiEntityType("USERNAME", "USERNAME", 16, Hints.empty)
  case object PASSWORD extends PiiEntityType("PASSWORD", "PASSWORD", 17, Hints.empty)
  case object AWS_ACCESS_KEY extends PiiEntityType("AWS_ACCESS_KEY", "AWS_ACCESS_KEY", 18, Hints.empty)
  case object AWS_SECRET_KEY extends PiiEntityType("AWS_SECRET_KEY", "AWS_SECRET_KEY", 19, Hints.empty)
  case object IP_ADDRESS extends PiiEntityType("IP_ADDRESS", "IP_ADDRESS", 20, Hints.empty)
  case object MAC_ADDRESS extends PiiEntityType("MAC_ADDRESS", "MAC_ADDRESS", 21, Hints.empty)
  case object ALL extends PiiEntityType("ALL", "ALL", 22, Hints.empty)
  case object LICENSE_PLATE extends PiiEntityType("LICENSE_PLATE", "LICENSE_PLATE", 23, Hints.empty)
  case object VEHICLE_IDENTIFICATION_NUMBER extends PiiEntityType("VEHICLE_IDENTIFICATION_NUMBER", "VEHICLE_IDENTIFICATION_NUMBER", 24, Hints.empty)
  case object UK_NATIONAL_INSURANCE_NUMBER extends PiiEntityType("UK_NATIONAL_INSURANCE_NUMBER", "UK_NATIONAL_INSURANCE_NUMBER", 25, Hints.empty)
  case object CA_SOCIAL_INSURANCE_NUMBER extends PiiEntityType("CA_SOCIAL_INSURANCE_NUMBER", "CA_SOCIAL_INSURANCE_NUMBER", 26, Hints.empty)
  case object US_INDIVIDUAL_TAX_IDENTIFICATION_NUMBER extends PiiEntityType("US_INDIVIDUAL_TAX_IDENTIFICATION_NUMBER", "US_INDIVIDUAL_TAX_IDENTIFICATION_NUMBER", 27, Hints.empty)
  case object UK_UNIQUE_TAXPAYER_REFERENCE_NUMBER extends PiiEntityType("UK_UNIQUE_TAXPAYER_REFERENCE_NUMBER", "UK_UNIQUE_TAXPAYER_REFERENCE_NUMBER", 28, Hints.empty)
  case object IN_PERMANENT_ACCOUNT_NUMBER extends PiiEntityType("IN_PERMANENT_ACCOUNT_NUMBER", "IN_PERMANENT_ACCOUNT_NUMBER", 29, Hints.empty)
  case object IN_NREGA extends PiiEntityType("IN_NREGA", "IN_NREGA", 30, Hints.empty)
  case object INTERNATIONAL_BANK_ACCOUNT_NUMBER extends PiiEntityType("INTERNATIONAL_BANK_ACCOUNT_NUMBER", "INTERNATIONAL_BANK_ACCOUNT_NUMBER", 31, Hints.empty)
  case object SWIFT_CODE extends PiiEntityType("SWIFT_CODE", "SWIFT_CODE", 32, Hints.empty)
  case object UK_NATIONAL_HEALTH_SERVICE_NUMBER extends PiiEntityType("UK_NATIONAL_HEALTH_SERVICE_NUMBER", "UK_NATIONAL_HEALTH_SERVICE_NUMBER", 33, Hints.empty)
  case object CA_HEALTH_NUMBER extends PiiEntityType("CA_HEALTH_NUMBER", "CA_HEALTH_NUMBER", 34, Hints.empty)
  case object IN_AADHAAR extends PiiEntityType("IN_AADHAAR", "IN_AADHAAR", 35, Hints.empty)
  case object IN_VOTER_NUMBER extends PiiEntityType("IN_VOTER_NUMBER", "IN_VOTER_NUMBER", 36, Hints.empty)
  final case class $Unknown(str: String) extends PiiEntityType(str, "$Unknown", -1, Hints.empty)

  val $unknown: String => PiiEntityType = $Unknown(_)

  val values: List[PiiEntityType] = List(
    BANK_ACCOUNT_NUMBER,
    BANK_ROUTING,
    CREDIT_DEBIT_NUMBER,
    CREDIT_DEBIT_CVV,
    CREDIT_DEBIT_EXPIRY,
    PIN,
    EMAIL,
    ADDRESS,
    NAME,
    PHONE,
    SSN,
    DATE_TIME,
    PASSPORT_NUMBER,
    DRIVER_ID,
    URL,
    AGE,
    USERNAME,
    PASSWORD,
    AWS_ACCESS_KEY,
    AWS_SECRET_KEY,
    IP_ADDRESS,
    MAC_ADDRESS,
    ALL,
    LICENSE_PLATE,
    VEHICLE_IDENTIFICATION_NUMBER,
    UK_NATIONAL_INSURANCE_NUMBER,
    CA_SOCIAL_INSURANCE_NUMBER,
    US_INDIVIDUAL_TAX_IDENTIFICATION_NUMBER,
    UK_UNIQUE_TAXPAYER_REFERENCE_NUMBER,
    IN_PERMANENT_ACCOUNT_NUMBER,
    IN_NREGA,
    INTERNATIONAL_BANK_ACCOUNT_NUMBER,
    SWIFT_CODE,
    UK_NATIONAL_HEALTH_SERVICE_NUMBER,
    CA_HEALTH_NUMBER,
    IN_AADHAAR,
    IN_VOTER_NUMBER,
  )
  val tag: EnumTag[PiiEntityType] = EnumTag.OpenStringEnum($unknown)
  implicit val schema: Schema[PiiEntityType] = enumeration(tag, values).withId(id).addHints(hints)
}
