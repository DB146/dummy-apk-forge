package com.google.ads.interactivemedia.v3.internal;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzci implements zzcf {
    private final int[] zza = new int[2];

    @Override // com.google.ads.interactivemedia.v3.internal.zzcf
    public final JSONObject zza(View view) {
        if (view == null) {
            return zzcn.zza(0, 0, 0, 0);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(this.zza);
        int[] iArr = this.zza;
        return zzcn.zza(iArr[0], iArr[1], width, height);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzcf
    public final void zzb(View view, JSONObject jSONObject, zzce zzceVar, boolean z8, boolean z10) {
        int i7;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (!z8) {
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    zzceVar.zza(viewGroup.getChildAt(i10), this, jSONObject, z10);
                }
                return;
            }
            HashMap hashMap = new HashMap();
            for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                View childAt = viewGroup.getChildAt(i11);
                ArrayList arrayList = (ArrayList) hashMap.get(Float.valueOf(childAt.getZ()));
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    hashMap.put(Float.valueOf(childAt.getZ()), arrayList);
                }
                arrayList.add(childAt);
            }
            ArrayList arrayList2 = new ArrayList(hashMap.keySet());
            Collections.sort(arrayList2);
            int size = arrayList2.size();
            int i12 = 0;
            while (i12 < size) {
                ArrayList arrayList3 = (ArrayList) hashMap.get((Float) arrayList2.get(i12));
                int size2 = arrayList3.size();
                int i13 = 0;
                while (true) {
                    i7 = i12 + 1;
                    if (i13 < size2) {
                        zzceVar.zza((View) arrayList3.get(i13), this, jSONObject, z10);
                        i13++;
                    }
                }
                i12 = i7;
            }
        }
    }
}
