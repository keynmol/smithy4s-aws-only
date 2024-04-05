package com.amazonaws.comprehend

import smithy4s.Hints
import smithy4s.Schema
import smithy4s.ShapeId
import smithy4s.ShapeTag
import smithy4s.schema.Schema.struct

/** <p> Configuration parameters for an optional private Virtual Private Cloud (VPC) containing
  *       the resources you are using for the job. For more information, see <a href="https://docs.aws.amazon.com/vpc/latest/userguide/what-is-amazon-vpc.html">Amazon
  *         VPC</a>. </p>
  * @param SecurityGroupIds
  *   <p>The ID number for a security group on an instance of your private VPC. Security groups on
  *         your VPC function serve as a virtual firewall to control inbound and outbound traffic and
  *         provides security for the resources that you’ll be accessing on the VPC. This ID number is
  *         preceded by "sg-", for instance: "sg-03b388029b0a285ea". For more information, see <a href="https://docs.aws.amazon.com/vpc/latest/userguide/VPC_SecurityGroups.html">Security
  *           Groups for your VPC</a>. </p>
  * @param Subnets
  *   <p>The ID for each subnet being used in your private VPC. This subnet is a subset of the a
  *         range of IPv4 addresses used by the VPC and is specific to a given availability zone in the
  *         VPC’s Region. This ID number is preceded by "subnet-", for instance:
  *         "subnet-04ccf456919e69055". For more information, see <a href="https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html">VPCs and
  *           Subnets</a>. </p>
  */
final case class VpcConfig(securityGroupIds: List[SecurityGroupId], subnets: List[SubnetId])

object VpcConfig extends ShapeTag.Companion[VpcConfig] {
  val id: ShapeId = ShapeId("com.amazonaws.comprehend", "VpcConfig")

  val hints: Hints = Hints(
    smithy.api.Documentation("<p> Configuration parameters for an optional private Virtual Private Cloud (VPC) containing\n      the resources you are using for the job. For more information, see <a href=\"https://docs.aws.amazon.com/vpc/latest/userguide/what-is-amazon-vpc.html\">Amazon\n        VPC</a>. </p>"),
  ).lazily

  // constructor using the original order from the spec
  private def make(securityGroupIds: List[SecurityGroupId], subnets: List[SubnetId]): VpcConfig = VpcConfig(securityGroupIds, subnets)

  implicit val schema: Schema[VpcConfig] = struct(
    SecurityGroupIds.underlyingSchema.required[VpcConfig]("SecurityGroupIds", _.securityGroupIds).addHints(smithy.api.Documentation("<p>The ID number for a security group on an instance of your private VPC. Security groups on\n      your VPC function serve as a virtual firewall to control inbound and outbound traffic and\n      provides security for the resources that you’ll be accessing on the VPC. This ID number is\n      preceded by \"sg-\", for instance: \"sg-03b388029b0a285ea\". For more information, see <a href=\"https://docs.aws.amazon.com/vpc/latest/userguide/VPC_SecurityGroups.html\">Security\n        Groups for your VPC</a>. </p>")),
    Subnets.underlyingSchema.required[VpcConfig]("Subnets", _.subnets).addHints(smithy.api.Documentation("<p>The ID for each subnet being used in your private VPC. This subnet is a subset of the a\n      range of IPv4 addresses used by the VPC and is specific to a given availability zone in the\n      VPC’s Region. This ID number is preceded by \"subnet-\", for instance:\n      \"subnet-04ccf456919e69055\". For more information, see <a href=\"https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html\">VPCs and\n        Subnets</a>. </p>")),
  )(make).withId(id).addHints(hints)
}
