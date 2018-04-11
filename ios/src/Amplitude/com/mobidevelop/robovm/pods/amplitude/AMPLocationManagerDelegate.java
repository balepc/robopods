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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AMPLocationManagerDelegate/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements CLLocationManagerDelegate/*</implements>*/ {

    /*<ptr>*/public static class AMPLocationManagerDelegatePtr extends Ptr<AMPLocationManagerDelegate, AMPLocationManagerDelegatePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AMPLocationManagerDelegate.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public AMPLocationManagerDelegate() {}
    protected AMPLocationManagerDelegate(Handle h, long handle) { super(h, handle); }
    protected AMPLocationManagerDelegate(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "locationManager:didFailWithError:")
    public native void locationManager$didFailWithError$(CLLocationManager manager, NSError error);
    @Method(selector = "locationManager:didUpdateToLocation:fromLocation:")
    public native void locationManager$didUpdateToLocation$fromLocation$(CLLocationManager manager, CLLocation newLocation, CLLocation oldLocation);
    @Method(selector = "locationManager:didChangeAuthorizationStatus:")
    public native void locationManager$didChangeAuthorizationStatus$(CLLocationManager manager, CLAuthorizationStatus status);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Method(selector = "locationManager:didUpdateLocations:")
    public native void didUpdateLocations(CLLocationManager manager, NSArray<CLLocation> locations);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Method(selector = "locationManager:didUpdateHeading:")
    public native void didUpdateHeading(CLLocationManager manager, CLHeading newHeading);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Method(selector = "locationManagerShouldDisplayHeadingCalibration:")
    public native boolean shouldDisplayHeadingCalibration(CLLocationManager manager);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Method(selector = "locationManager:didDetermineState:forRegion:")
    public native void didDetermineState(CLLocationManager manager, CLRegionState state, CLRegion region);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Method(selector = "locationManager:didRangeBeacons:inRegion:")
    public native void didRangeBeacons(CLLocationManager manager, NSArray<CLBeacon> beacons, CLBeaconRegion region);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Method(selector = "locationManager:rangingBeaconsDidFailForRegion:withError:")
    public native void rangingBeaconsDidFail(CLLocationManager manager, CLBeaconRegion region, NSError error);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Method(selector = "locationManager:didEnterRegion:")
    public native void didEnterRegion(CLLocationManager manager, CLRegion region);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Method(selector = "locationManager:didExitRegion:")
    public native void didExitRegion(CLLocationManager manager, CLRegion region);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Method(selector = "locationManager:monitoringDidFailForRegion:withError:")
    public native void monitoringDidFail(CLLocationManager manager, CLRegion region, NSError error);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Method(selector = "locationManager:didStartMonitoringForRegion:")
    public native void didStartMonitoring(CLLocationManager manager, CLRegion region);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Method(selector = "locationManagerDidPauseLocationUpdates:")
    public native void didPauseLocationUpdates(CLLocationManager manager);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Method(selector = "locationManagerDidResumeLocationUpdates:")
    public native void didResumeLocationUpdates(CLLocationManager manager);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Method(selector = "locationManager:didFinishDeferredUpdatesWithError:")
    public native void didFinishDeferredUpdates(CLLocationManager manager, NSError error);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Method(selector = "locationManager:didVisit:")
    public native void didVisit(CLLocationManager manager, CLVisit visit);
    /*</methods>*/
}
