package w9;

import c2.i;
import h3.C1249k;
import h3.w;
import java.io.File;
import java.util.LinkedHashMap;
import jb.InterfaceC1392c;
import jb.InterfaceC1394e;
import kotlin.jvm.internal.l;
import t9.C2035a;

/* renamed from: w9.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2226b implements InterfaceC1392c, InterfaceC1394e {

    /* renamed from: a, reason: collision with root package name */
    public static final C2226b f25825a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final C2226b f25826b = new Object();

    @Override // jb.InterfaceC1394e
    public Object apply(Object obj) {
        File it = (File) obj;
        l.e(it, "it");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("extra:apk_file_path", it.getAbsolutePath());
        C1249k c1249k = new C1249k(linkedHashMap);
        i.y(c1249k);
        return new w(c1249k);
    }

    @Override // jb.InterfaceC1392c
    public boolean w(Integer num, Throwable throwable) {
        l.e(throwable, "throwable");
        return num.intValue() < 3 && (throwable instanceof C2035a) && ((C2035a) throwable).f24514a > 0;
    }
}
