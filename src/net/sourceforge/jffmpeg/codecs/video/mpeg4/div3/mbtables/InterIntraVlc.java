/*
 * Java port of parts of the ffmpeg Mpeg4 base decoder.
 * Copyright (c) 2003 Jonathan Hueber.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 *
 * See Credits file and Readme for details
 */
package net.sourceforge.jffmpeg.codecs.video.mpeg4.div3.mbtables;

import net.sourceforge.jffmpeg.codecs.utils.VLCTable;

/* non intra picture macro block coded block pattern + mb type */
public class InterIntraVlc extends VLCTable {

    public InterIntraVlc() {
        vlcCodes = new long[][] {
            {0,1},{2,2},{6,3},{7,3}
        };
        createHighSpeedTable();
    }
}
