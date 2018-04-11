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
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/MPAdAlertManagerProtocol/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    @Property(selector = "adConfiguration")
    MPAdConfiguration getAdConfiguration();
    @Property(selector = "setAdConfiguration:")
    void setAdConfiguration(MPAdConfiguration v);
    @Property(selector = "adUnitId")
    String getAdUnitId();
    @Property(selector = "setAdUnitId:")
    void setAdUnitId(String v);
    @Property(selector = "location")
    CLLocation getLocation();
    @Property(selector = "setLocation:")
    void setLocation(CLLocation v);
    @Property(selector = "targetAdView")
    UIView getTargetAdView();
    @Property(selector = "setTargetAdView:", strongRef = true)
    void setTargetAdView(UIView v);
    @Property(selector = "delegate")
    NSObject getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    void setDelegate(NSObject v);
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "beginMonitoringAlerts")
    void beginMonitoringAlerts();
    @Method(selector = "endMonitoringAlerts")
    void endMonitoringAlerts();
    @Method(selector = "processAdAlertOnce")
    void processAdAlertOnce();
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
