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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AMPRevenue/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AMPRevenuePtr extends Ptr<AMPRevenue, AMPRevenuePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AMPRevenue.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public AMPRevenue() {}
    protected AMPRevenue(Handle h, long handle) { super(h, handle); }
    protected AMPRevenue(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "productId")
    public native String getProductId();
    @Property(selector = "price")
    public native NSNumber getPrice();
    @Property(selector = "setPrice:")
    public native void setPrice(NSNumber v);
    @Property(selector = "quantity")
    public native @MachineSizedSInt long getQuantity();
    @Property(selector = "setQuantity:")
    public native void setQuantity(@MachineSizedSInt long v);
    @Property(selector = "revenueType")
    public native String getRevenueType();
    @Property(selector = "setRevenueType:")
    public native void setRevenueType(String v);
    @Property(selector = "receipt")
    public native NSData getReceipt();
    @Property(selector = "setReceipt:")
    public native void setReceipt(NSData v);
    @Property(selector = "properties")
    public native NSDictionary<?, ?> getProperties();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "isValidRevenue")
    public native boolean isValidRevenue();
    @Method(selector = "setProductIdentifier:")
    public native AMPRevenue setProductIdentifier(String productIdentifier);
    @Method(selector = "setEventProperties:")
    public native AMPRevenue setEventProperties(NSDictionary<?, ?> eventProperties);
    @Method(selector = "toNSDictionary")
    public native NSDictionary<?, ?> toNSDictionary();
    @Method(selector = "revenue")
    public static native AMPRevenue revenue();
    /*</methods>*/
}
