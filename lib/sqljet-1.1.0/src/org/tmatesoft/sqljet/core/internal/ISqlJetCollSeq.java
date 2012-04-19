/**
 * ISqlJetCollSeq.java
 * Copyright (C) 2009-2010 TMate Software Ltd
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; version 2 of the License.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * For information on how to redistribute this software under
 * the terms of a license other than GNU General Public License
 * contact TMate Software at support@sqljet.com
 */
package org.tmatesoft.sqljet.core.internal;

import org.tmatesoft.sqljet.core.SqlJetEncoding;

/**
 * @author TMate Software Ltd.
 * @author Sergey Scherbina (sergey.scherbina@gmail.com)
 * 
 */
public interface ISqlJetCollSeq {

    /**
     * @return
     */
    Object getUserData();

    /**
     * @param userData
     * @param n
     * @param z
     * @param n2
     * @param z2
     * @return
     */
    int cmp(Object userData, int n, ISqlJetMemoryPointer z, int n2, ISqlJetMemoryPointer z2);

    /**
     * @return
     */
    SqlJetEncoding getEnc();

}
