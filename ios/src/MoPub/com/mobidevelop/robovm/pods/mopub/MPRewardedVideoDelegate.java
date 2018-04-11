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
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/MPRewardedVideoDelegate/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "rewardedVideoAdDidLoadForAdUnitID:")
    void rewardedVideoAdDidLoadForAdUnitID(String adUnitID);
    @Method(selector = "rewardedVideoAdDidFailToLoadForAdUnitID:error:")
    void rewardedVideoAdDidFailToLoadForAdUnitID$error$(String adUnitID, NSError error);
    @Method(selector = "rewardedVideoAdDidExpireForAdUnitID:")
    void rewardedVideoAdDidExpireForAdUnitID(String adUnitID);
    @Method(selector = "rewardedVideoAdDidFailToPlayForAdUnitID:error:")
    void rewardedVideoAdDidFailToPlayForAdUnitID$error$(String adUnitID, NSError error);
    @Method(selector = "rewardedVideoAdWillAppearForAdUnitID:")
    void rewardedVideoAdWillAppearForAdUnitID(String adUnitID);
    @Method(selector = "rewardedVideoAdDidAppearForAdUnitID:")
    void rewardedVideoAdDidAppearForAdUnitID(String adUnitID);
    @Method(selector = "rewardedVideoAdWillDisappearForAdUnitID:")
    void rewardedVideoAdWillDisappearForAdUnitID(String adUnitID);
    @Method(selector = "rewardedVideoAdDidDisappearForAdUnitID:")
    void rewardedVideoAdDidDisappearForAdUnitID(String adUnitID);
    @Method(selector = "rewardedVideoAdDidReceiveTapEventForAdUnitID:")
    void rewardedVideoAdDidReceiveTapEventForAdUnitID(String adUnitID);
    @Method(selector = "rewardedVideoAdWillLeaveApplicationForAdUnitID:")
    void rewardedVideoAdWillLeaveApplicationForAdUnitID(String adUnitID);
    @Method(selector = "rewardedVideoAdShouldRewardForAdUnitID:reward:")
    void rewardedVideoAdShouldRewardForAdUnitID$reward$(String adUnitID, MPRewardedVideoReward reward);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
