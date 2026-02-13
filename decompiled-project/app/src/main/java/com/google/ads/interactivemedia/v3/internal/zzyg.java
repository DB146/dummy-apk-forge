package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumSet;

/* loaded from: classes.dex */
final class zzyg implements zzyz {
    final /* synthetic */ Type zza;

    public zzyg(Type type) {
        this.zza = type;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzyz
    public final Object zza() {
        Type type = this.zza;
        if (!(type instanceof ParameterizedType)) {
            throw new zzws("Invalid EnumSet type: ".concat(String.valueOf(type.toString())));
        }
        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        if (type2 instanceof Class) {
            return EnumSet.noneOf((Class) type2);
        }
        throw new zzws("Invalid EnumSet type: ".concat(String.valueOf(this.zza.toString())));
    }
}
