/*-------------------------------------------------------------------------
 *                   (c) 2009 by KEBA Ges.m.b.H & Co
 *                            Linz/AUSTRIA
 *                         All rights reserved
 *--------------------------------------------------------------------------
 *    Projekt   : keplast.hmi.kvs_dev_ODC
 *    Datum     : 30.01.2009
 *    Archive   : Core.hmi
 *--------------------------------------------------------------------------  *
 */
package CoolingTime1.hmi;

import system.hmi.ODCActiveAndAnyMoveController;

/**
 * Visibilitycontroller for editor mode. Systemvariables with this controller
 * will be only enabled in editor mode if:
 *
 * <code>*</code> Device is activated <code>*</code> Any movement of the
 * aggregate is programmed in sequence.
 *
 * Checks for <code>sv_MoveCooling.bProgrammedInSequence</code>
 *  
 *
 */
public class CoolingTimeProgrammedVisControl extends ODCActiveAndAnyMoveController {
   
   /**
    * @see system.hmi.ODCActiveAndAnyMoveController#getMovementNames()
    */
   public String[] getMovementNames() {
      return new String[] {"sv_MoveCooling"};
   }
   /**
    * @see system.hmi.ODCActiveAndAnyMoveController#initialize()
    */
   public void initialize() {
   }

}
