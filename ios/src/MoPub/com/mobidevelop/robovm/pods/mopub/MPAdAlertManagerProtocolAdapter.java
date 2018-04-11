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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPAdAlertManagerProtocolAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements MPAdAlertManagerProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    @NotImplemented("adConfiguration")
    public MPAdConfiguration getAdConfiguration() { return null; }
    @NotImplemented("setAdConfiguration:")
    public void setAdConfiguration(MPAdConfiguration v) {}
    @NotImplemented("adUnitId")
    public String getAdUnitId() { return null; }
    @NotImplemented("setAdUnitId:")
    public void setAdUnitId(String v) {}
    @NotImplemented("location")
    public CLLocation getLocation() { return null; }
    @NotImplemented("setLocation:")
    public void setLocation(CLLocation v) {}
    @NotImplemented("targetAdView")
    public UIView getTargetAdView() { return null; }
    @NotImplemented("setTargetAdView:")
    public void setTargetAdView(UIView v) {}
    @NotImplemented("delegate")
    public NSObject getDelegate() { return null; }
    @NotImplemented("setDelegate:")
    public void setDelegate(NSObject v) {}
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @NotImplemented("beginMonitoringAlerts")
    public void beginMonitoringAlerts() {}
    @NotImplemented("endMonitoringAlerts")
    public void endMonitoringAlerts() {}
    @NotImplemented("processAdAlertOnce")
    public void processAdAlertOnce() {}
    /*</methods>*/
}
