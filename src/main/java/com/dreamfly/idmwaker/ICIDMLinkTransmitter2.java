package com.dreamfly.idmwaker;

import com4j.*;

/**
 * IDMWaker
 *
 * @author dreamfly
 * @since 2021年04月01日 22:50
 */

/**
 * ICIDMLinkTransmitter2 Interface
 */
@IID("{94D09862-1875-4FC9-B434-91CF25C840A1}")
public interface ICIDMLinkTransmitter2 extends ICIDMLinkTransmitter {
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
   * @param reserved1 Mandatory java.lang.Object parameter.
   * @param reserved2 Mandatory java.lang.Object parameter.
   */

  @VTID(4)
   void sendLinkToIDM2(
          String bstrUrl,
          String bstrReferer,
          String bstrCookies,
          String bstrData,
          String bstrUser,
          String bstrPassword,
          String bstrLocalPath,
          String bstrLocalFileName,
          int lFlags,
          @MarshalAs(NativeType.VARIANT) Object reserved1,
          @MarshalAs(NativeType.VARIANT) Object reserved2);


  /**
   * @param location Mandatory java.lang.String parameter.
   * @param pLinksArray Mandatory java.lang.Object parameter.
   */

  @VTID(5)
  void sendLinksArray(
          String location,
          Object pLinksArray);


  // Properties:
}
