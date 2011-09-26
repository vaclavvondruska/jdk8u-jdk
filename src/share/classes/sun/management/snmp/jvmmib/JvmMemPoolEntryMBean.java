/*
 * Copyright (c) 2003, 2004, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

package sun.management.snmp.jvmmib;

//
// Generated by mibgen version 5.0 (06/02/03) when compiling JVM-MANAGEMENT-MIB in standard metadata mode.
//


// jmx imports
//
import com.sun.jmx.snmp.SnmpStatusException;

/**
 * This interface is used for representing the remote management interface for the "JvmMemPoolEntry" MBean.
 */
public interface JvmMemPoolEntryMBean {

    /**
     * Getter for the "JvmMemPoolCollectMaxSize" variable.
     */
    public Long getJvmMemPoolCollectMaxSize() throws SnmpStatusException;

    /**
     * Getter for the "JvmMemPoolCollectCommitted" variable.
     */
    public Long getJvmMemPoolCollectCommitted() throws SnmpStatusException;

    /**
     * Getter for the "JvmMemPoolCollectUsed" variable.
     */
    public Long getJvmMemPoolCollectUsed() throws SnmpStatusException;

    /**
     * Getter for the "JvmMemPoolCollectThreshdSupport" variable.
     */
    public EnumJvmMemPoolCollectThreshdSupport getJvmMemPoolCollectThreshdSupport() throws SnmpStatusException;

    /**
     * Getter for the "JvmMemPoolCollectThreshdCount" variable.
     */
    public Long getJvmMemPoolCollectThreshdCount() throws SnmpStatusException;

    /**
     * Getter for the "JvmMemPoolCollectThreshold" variable.
     */
    public Long getJvmMemPoolCollectThreshold() throws SnmpStatusException;

    /**
     * Setter for the "JvmMemPoolCollectThreshold" variable.
     */
    public void setJvmMemPoolCollectThreshold(Long x) throws SnmpStatusException;

    /**
     * Checker for the "JvmMemPoolCollectThreshold" variable.
     */
    public void checkJvmMemPoolCollectThreshold(Long x) throws SnmpStatusException;

    /**
     * Getter for the "JvmMemPoolMaxSize" variable.
     */
    public Long getJvmMemPoolMaxSize() throws SnmpStatusException;

    /**
     * Getter for the "JvmMemPoolCommitted" variable.
     */
    public Long getJvmMemPoolCommitted() throws SnmpStatusException;

    /**
     * Getter for the "JvmMemPoolUsed" variable.
     */
    public Long getJvmMemPoolUsed() throws SnmpStatusException;

    /**
     * Getter for the "JvmMemPoolInitSize" variable.
     */
    public Long getJvmMemPoolInitSize() throws SnmpStatusException;

    /**
     * Getter for the "JvmMemPoolThreshdSupport" variable.
     */
    public EnumJvmMemPoolThreshdSupport getJvmMemPoolThreshdSupport() throws SnmpStatusException;

    /**
     * Getter for the "JvmMemPoolThreshdCount" variable.
     */
    public Long getJvmMemPoolThreshdCount() throws SnmpStatusException;

    /**
     * Getter for the "JvmMemPoolThreshold" variable.
     */
    public Long getJvmMemPoolThreshold() throws SnmpStatusException;

    /**
     * Setter for the "JvmMemPoolThreshold" variable.
     */
    public void setJvmMemPoolThreshold(Long x) throws SnmpStatusException;

    /**
     * Checker for the "JvmMemPoolThreshold" variable.
     */
    public void checkJvmMemPoolThreshold(Long x) throws SnmpStatusException;

    /**
     * Getter for the "JvmMemPoolPeakReset" variable.
     */
    public Long getJvmMemPoolPeakReset() throws SnmpStatusException;

    /**
     * Setter for the "JvmMemPoolPeakReset" variable.
     */
    public void setJvmMemPoolPeakReset(Long x) throws SnmpStatusException;

    /**
     * Checker for the "JvmMemPoolPeakReset" variable.
     */
    public void checkJvmMemPoolPeakReset(Long x) throws SnmpStatusException;

    /**
     * Getter for the "JvmMemPoolState" variable.
     */
    public EnumJvmMemPoolState getJvmMemPoolState() throws SnmpStatusException;

    /**
     * Getter for the "JvmMemPoolType" variable.
     */
    public EnumJvmMemPoolType getJvmMemPoolType() throws SnmpStatusException;

    /**
     * Getter for the "JvmMemPoolName" variable.
     */
    public String getJvmMemPoolName() throws SnmpStatusException;

    /**
     * Getter for the "JvmMemPoolPeakMaxSize" variable.
     */
    public Long getJvmMemPoolPeakMaxSize() throws SnmpStatusException;

    /**
     * Getter for the "JvmMemPoolIndex" variable.
     */
    public Integer getJvmMemPoolIndex() throws SnmpStatusException;

    /**
     * Getter for the "JvmMemPoolPeakCommitted" variable.
     */
    public Long getJvmMemPoolPeakCommitted() throws SnmpStatusException;

    /**
     * Getter for the "JvmMemPoolPeakUsed" variable.
     */
    public Long getJvmMemPoolPeakUsed() throws SnmpStatusException;

}
