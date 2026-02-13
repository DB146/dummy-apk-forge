package ma;

import Eb.w;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: ma.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1653d {

    /* renamed from: a, reason: collision with root package name */
    public final String f20825a;

    /* renamed from: b, reason: collision with root package name */
    public final String f20826b;

    /* renamed from: c, reason: collision with root package name */
    public final String f20827c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f20828d;

    public C1653d(String str, String str2, String str3, LinkedHashMap linkedHashMap, int i7) {
        str3 = (i7 & 4) != 0 ? null : str3;
        Map map = (i7 & 16) != 0 ? w.f3892a : linkedHashMap;
        this.f20825a = str;
        this.f20826b = str2;
        this.f20827c = str3;
        this.f20828d = map;
    }
}
