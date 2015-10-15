package br.com.ingenieux.mojo.aws.util;

import com.amazonaws.services.ec2.AmazonEC2;
import com.amazonaws.services.elasticbeanstalk.AWSElasticBeanstalk;
import com.amazonaws.services.elasticloadbalancing.AmazonElasticLoadBalancing;
import com.amazonaws.services.elasticmapreduce.AmazonElasticMapReduce;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.simpledb.AmazonSimpleDB;

public enum ServiceEndpointFormatter {
  ELASTICBEANSTALK(AWSElasticBeanstalk.class, "elasticbeanstalk.%s.%s"),
  EC2(AmazonEC2.class, "ec2.%s.%s"),
  ELASTICMAPREDUCE(AmazonElasticMapReduce.class, "elasticmapreduce.%s.%s"),
  SIMPLEDB(AmazonSimpleDB.class, "sdb.%s.%s"),
  S3(AmazonS3.class, "s3-%s.%s"),
  ELB(AmazonElasticLoadBalancing.class, "elasticloadbalancing.%s.%s");

  final Class<?> serviceClass;

  final String serviceMask;

  ServiceEndpointFormatter(Class<?> serviceClass, String serviceMask) {
    this.serviceClass = serviceClass;
    this.serviceMask = serviceMask;
  }

  public boolean matches(Object obj) {
    return serviceClass.isAssignableFrom(obj.getClass());
  }
}