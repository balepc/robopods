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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPStreamAdPlacer/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPStreamAdPlacerPtr extends Ptr<MPStreamAdPlacer, MPStreamAdPlacerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPStreamAdPlacer.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPStreamAdPlacer() {}
    protected MPStreamAdPlacer(Handle h, long handle) { super(h, handle); }
    protected MPStreamAdPlacer(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "visibleIndexPaths")
    public native NSArray<?> getVisibleIndexPaths();
    @Property(selector = "setVisibleIndexPaths:")
    public native void setVisibleIndexPaths(NSArray<?> v);
    @Property(selector = "rendererConfigurations")
    public native NSArray<?> getRendererConfigurations();
    @Property(selector = "viewController")
    public native UIViewController getViewController();
    @Property(selector = "setViewController:", strongRef = true)
    public native void setViewController(UIViewController v);
    @Property(selector = "delegate")
    public native MPStreamAdPlacerDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(MPStreamAdPlacerDelegate v);
    @Property(selector = "adPositioning")
    public native MPAdPositioning getAdPositioning();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "setItemCount:forSection:")
    public native void setItemCount$forSection$(@MachineSizedUInt long count, @MachineSizedSInt long section);
    @Method(selector = "renderAdAtIndexPath:inView:")
    public native void renderAdAtIndexPath$inView$(NSIndexPath indexPath, UIView view);
    @Method(selector = "sizeForAdAtIndexPath:withMaximumWidth:")
    public native @ByVal CGSize sizeForAdAtIndexPath$withMaximumWidth$(NSIndexPath indexPath, @MachineSizedFloat double maxWidth);
    @Method(selector = "loadAdsForAdUnitID:")
    public native void loadAdsForAdUnitID(String adUnitID);
    @Method(selector = "loadAdsForAdUnitID:targeting:")
    public native void loadAdsForAdUnitID$targeting$(String adUnitID, MPNativeAdRequestTargeting targeting);
    @Method(selector = "isAdAtIndexPath:")
    public native boolean isAdAtIndexPath(NSIndexPath indexPath);
    @Method(selector = "adjustedNumberOfItems:inSection:")
    public native @MachineSizedUInt long adjustedNumberOfItems$inSection$(@MachineSizedUInt long numberOfItems, @MachineSizedUInt long section);
    @Method(selector = "adjustedIndexPathForOriginalIndexPath:")
    public native NSIndexPath adjustedIndexPathForOriginalIndexPath(NSIndexPath indexPath);
    @Method(selector = "originalIndexPathForAdjustedIndexPath:")
    public native NSIndexPath originalIndexPathForAdjustedIndexPath(NSIndexPath indexPath);
    @Method(selector = "adjustedIndexPathsForOriginalIndexPaths:")
    public native NSArray<?> adjustedIndexPathsForOriginalIndexPaths(NSArray<?> indexPaths);
    @Method(selector = "originalIndexPathsForAdjustedIndexPaths:")
    public native NSArray<?> originalIndexPathsForAdjustedIndexPaths(NSArray<?> indexPaths);
    @Method(selector = "insertItemsAtIndexPaths:")
    public native void insertItemsAtIndexPaths(NSArray<?> originalIndexPaths);
    @Method(selector = "deleteItemsAtIndexPaths:")
    public native void deleteItemsAtIndexPaths(NSArray<?> originalIndexPaths);
    @Method(selector = "moveItemAtIndexPath:toIndexPath:")
    public native void moveItemAtIndexPath$toIndexPath$(NSIndexPath fromIndexPath, NSIndexPath toIndexPath);
    @Method(selector = "insertSections:")
    public native void insertSections(NSIndexSet sections);
    @Method(selector = "deleteSections:")
    public native void deleteSections(NSIndexSet sections);
    @Method(selector = "moveSection:toSection:")
    public native void moveSection$toSection$(@MachineSizedSInt long section, @MachineSizedSInt long newSection);
    @Method(selector = "placerWithViewController:adPositioning:rendererConfigurations:")
    public static native MPStreamAdPlacer placerWithViewController$adPositioning$rendererConfigurations$(UIViewController controller, MPAdPositioning positioning, NSArray<?> rendererConfigurations);
    /*</methods>*/
}
