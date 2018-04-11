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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPTableViewAdPlacer/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPTableViewAdPlacerPtr extends Ptr<MPTableViewAdPlacer, MPTableViewAdPlacerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPTableViewAdPlacer.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPTableViewAdPlacer() {}
    protected MPTableViewAdPlacer(Handle h, long handle) { super(h, handle); }
    protected MPTableViewAdPlacer(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "delegate")
    public native MPTableViewAdPlacerDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(MPTableViewAdPlacerDelegate v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "loadAdsForAdUnitID:")
    public native void loadAdsForAdUnitID(String adUnitID);
    @Method(selector = "loadAdsForAdUnitID:targeting:")
    public native void loadAdsForAdUnitID$targeting$(String adUnitID, MPNativeAdRequestTargeting targeting);
    @Method(selector = "placerWithTableView:viewController:rendererConfigurations:")
    public static native MPTableViewAdPlacer placerWithTableView$viewController$rendererConfigurations$(UITableView tableView, UIViewController controller, NSArray<?> rendererConfigurations);
    @Method(selector = "placerWithTableView:viewController:adPositioning:rendererConfigurations:")
    public static native MPTableViewAdPlacer placerWithTableView$viewController$adPositioning$rendererConfigurations$(UITableView tableView, UIViewController controller, MPAdPositioning positioning, NSArray<?> rendererConfigurations);
    /*</methods>*/
}
