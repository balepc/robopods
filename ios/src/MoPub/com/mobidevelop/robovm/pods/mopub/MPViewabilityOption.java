/*
 * Copyright (C) 2013-2015 RoboVM AB
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.mobidevelop.robovm.pods.mopub;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.annotation.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.storekit.*;
import org.robovm.apple.corelocation.*;
import org.robovm.apple.coregraphics.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Marshaler(Bits.AsMachineSizedIntMarshaler.class)/*</annotations>*/
public final class /*<name>*/MPViewabilityOption/*</name>*/ extends Bits</*<name>*/MPViewabilityOption/*</name>*/> {
    /*<values>*/
    public static final MPViewabilityOption None = new MPViewabilityOption(0L);
    public static final MPViewabilityOption IAS = new MPViewabilityOption(1L);
    public static final MPViewabilityOption Moat = new MPViewabilityOption(2L);
    public static final MPViewabilityOption All = new MPViewabilityOption(3L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private static final /*<name>*/MPViewabilityOption/*</name>*/[] values = _values(/*<name>*/MPViewabilityOption/*</name>*/.class);

    public /*<name>*/MPViewabilityOption/*</name>*/(long value) { super(value); }
    private /*<name>*/MPViewabilityOption/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/MPViewabilityOption/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/MPViewabilityOption/*</name>*/(value, mask);
    }
    protected /*<name>*/MPViewabilityOption/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/MPViewabilityOption/*</name>*/[] values() {
        return values.clone();
    }
}
