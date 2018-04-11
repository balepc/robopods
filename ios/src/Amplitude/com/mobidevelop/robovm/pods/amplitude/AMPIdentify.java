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
package com.mobidevelop.robovm.pods.amplitude;

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
import org.robovm.apple.corelocation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AMPIdentify/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AMPIdentifyPtr extends Ptr<AMPIdentify, AMPIdentifyPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AMPIdentify.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public AMPIdentify() {}
    protected AMPIdentify(Handle h, long handle) { super(h, handle); }
    protected AMPIdentify(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "userPropertyOperations")
    public native NSMutableDictionary<?, ?> getUserPropertyOperations();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "add:value:")
    public native AMPIdentify add$value$(String property, NSObject value);
    @Method(selector = "append:value:")
    public native AMPIdentify append$value$(String property, NSObject value);
    @Method(selector = "clearAll")
    public native AMPIdentify clearAll();
    @Method(selector = "prepend:value:")
    public native AMPIdentify prepend$value$(String property, NSObject value);
    @Method(selector = "set:value:")
    public native AMPIdentify set$value$(String property, NSObject value);
    @Method(selector = "setOnce:value:")
    public native AMPIdentify setOnce$value$(String property, NSObject value);
    @Method(selector = "unset:")
    public native AMPIdentify unset(String property);
    @Method(selector = "identify")
    public static native AMPIdentify identify();
    /*</methods>*/
}
