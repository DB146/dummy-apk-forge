package com.google.ads.interactivemedia.v3.impl.data;

import A3.c;
import com.google.ads.interactivemedia.v3.internal.zzqy;
import h3.o;

@zzqy(zza = zzo.class)
/* loaded from: classes.dex */
public abstract class CompanionData {
    private String companionId;

    private static CompanionData create(String str, String str2, String str3, zzav zzavVar) {
        return new zzo(str, str2, str3, zzavVar);
    }

    public static CompanionData create(String str, String str2, String str3, String str4, zzav zzavVar) {
        CompanionData create = create(str2, str3, str4, zzavVar);
        create.companionId = str;
        return create;
    }

    public abstract String clickThroughUrl();

    public String companionId() {
        return this.companionId;
    }

    public abstract String size();

    public abstract String src();

    public final String toString() {
        String companionId = companionId();
        String size = size();
        String src = src();
        String clickThroughUrl = clickThroughUrl();
        String valueOf = String.valueOf(type());
        StringBuilder o10 = c.o("CompanionData [companionId=", companionId, ", size=", size, ", src=");
        o.v(o10, src, ", clickThroughUrl=", clickThroughUrl, ", type=");
        return o.p(o10, valueOf, "]");
    }

    public abstract zzav type();
}
