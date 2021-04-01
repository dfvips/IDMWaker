package com.dreamfly.idmwaker;

import com4j.*;


/**
 * IDMWaker
 *
 * @author dreamfly
 * @since 2021年04月01日 22:50
 */


/**
 * Defines methods to create COM objects
 */
public abstract class ClassFactory {
  private ClassFactory() {} // instanciation is not allowed


  /**
   * CIDMLinkTransmitter Class
   */
  public static ICIDMLinkTransmitter2 createCIDMLinkTransmitter() {
    return COM4J.createInstance( ICIDMLinkTransmitter2.class, "{AC746233-E9D3-49CD-862F-068F7B7CCCA4}" );
  }
}
