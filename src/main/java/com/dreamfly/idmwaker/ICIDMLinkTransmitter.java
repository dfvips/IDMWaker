package com.dreamfly.idmwaker;

import com4j.*;

/**
 * IDMWaker
 *
 * @author dreamfly
 * @since 2021年04月01日 22:50
 */

/**
 * ICIDMLinkTransmitter Interface
 */
@IID("{4BD46AAE-C51F-4BF7-8BC0-2E86E33D1873}")
public interface ICIDMLinkTransmitter extends Com4jObject {
  // Methods:
  /**
   * @param bstrUrl Mandatory java.lang.String parameter.
   * @param bstrReferer Mandatory java.lang.String parameter.
   * @param bstrCookies Mandatory java.lang.String parameter.
   * @param bstrData Mandatory java.lang.String parameter.
   * @param bstrUser Mandatory java.lang.String parameter.
   * @param bstrPassword Mandatory java.lang.String parameter.
   * @param bstrLocalPath Mandatory java.lang.String parameter.
   * @param bstrLocalFileName Mandatory java.lang.String parameter.
   * @param lFlags Mandatory int parameter.
   */

  @VTID(3)
  void sendLinkToIDM(
          String bstrUrl,
          String bstrReferer,
          String bstrCookies,
          String bstrData,
          String bstrUser,
          String bstrPassword,
          String bstrLocalPath,
          String bstrLocalFileName,
          int lFlags);


  // Properties:
}
