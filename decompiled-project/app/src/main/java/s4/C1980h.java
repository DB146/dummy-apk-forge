package s4;

import C4.A;
import C4.C0239a;
import C4.C0241c;
import C4.C0242d;
import C4.C0244f;
import C4.D;
import N6.F;
import N6.H;
import N6.t0;
import android.net.Uri;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import ea.C1111f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import n5.AbstractC1705a;
import n5.C1704A;
import r7.C1948d;
import t4.C2028a;
import u4.C2102b;
import v4.C2141b;
import w4.C2215b;
import x4.C2263a;
import z4.C2591d;

/* renamed from: s4.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1980h implements InterfaceC1985m {

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f24059b = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14};

    /* renamed from: c, reason: collision with root package name */
    public static final C1111f f24060c = new C1111f(new C1948d(5));

    /* renamed from: d, reason: collision with root package name */
    public static final C1111f f24061d = new C1111f(new C1948d(6));

    /* renamed from: a, reason: collision with root package name */
    public t0 f24062a;

    public final void a(int i7, ArrayList arrayList) {
        switch (i7) {
            case 0:
                arrayList.add(new C0239a());
                return;
            case 1:
                arrayList.add(new C0241c());
                return;
            case 2:
                arrayList.add(new C0242d());
                return;
            case 3:
                arrayList.add(new C2028a());
                return;
            case 4:
                InterfaceC1982j r10 = f24060c.r(0);
                if (r10 != null) {
                    arrayList.add(r10);
                    return;
                } else {
                    arrayList.add(new C2141b());
                    return;
                }
            case 5:
                arrayList.add(new C2215b());
                return;
            case 6:
                arrayList.add(new y4.d(0));
                return;
            case 7:
                arrayList.add(new C2591d());
                return;
            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                arrayList.add(new A4.n(0, null, null, Collections.emptyList(), null));
                arrayList.add(new A4.r());
                return;
            case 9:
                arrayList.add(new Object());
                return;
            case 10:
                arrayList.add(new A());
                return;
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                if (this.f24062a == null) {
                    F f4 = H.f7232b;
                    this.f24062a = t0.f7341e;
                }
                arrayList.add(new D(1, new C1704A(0L), new C0244f(0, this.f24062a)));
                return;
            case 12:
                arrayList.add(new D4.d());
                return;
            case 13:
            default:
                return;
            case 14:
                arrayList.add(new C2263a());
                return;
            case 15:
                InterfaceC1982j r11 = f24061d.r(new Object[0]);
                if (r11 != null) {
                    arrayList.add(r11);
                    return;
                }
                return;
            case 16:
                arrayList.add(new C2102b());
                return;
        }
    }

    @Override // s4.InterfaceC1985m
    public final synchronized InterfaceC1982j[] c() {
        return f(Uri.EMPTY, new HashMap());
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b A[Catch: all -> 0x0047, TryCatch #0 {all -> 0x0047, blocks: (B:3:0x0001, B:5:0x0015, B:8:0x001c, B:9:0x0024, B:11:0x002b, B:12:0x002e, B:15:0x0036, B:18:0x003b, B:21:0x0041, B:23:0x0044, B:27:0x0049), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003b A[Catch: all -> 0x0047, TryCatch #0 {all -> 0x0047, blocks: (B:3:0x0001, B:5:0x0015, B:8:0x001c, B:9:0x0024, B:11:0x002b, B:12:0x002e, B:15:0x0036, B:18:0x003b, B:21:0x0041, B:23:0x0044, B:27:0x0049), top: B:2:0x0001 }] */
    @Override // s4.InterfaceC1985m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized InterfaceC1982j[] f(Uri uri, Map map) {
        ArrayList arrayList;
        String str;
        int C2;
        int D10;
        try {
            int[] iArr = f24059b;
            arrayList = new ArrayList(16);
            List list = (List) map.get("Content-Type");
            if (list != null && !list.isEmpty()) {
                str = (String) list.get(0);
                C2 = AbstractC1705a.C(str);
                if (C2 != -1) {
                    a(C2, arrayList);
                }
                D10 = AbstractC1705a.D(uri);
                if (D10 != -1 && D10 != C2) {
                    a(D10, arrayList);
                }
                for (int i7 = 0; i7 < 16; i7++) {
                    int i10 = iArr[i7];
                    if (i10 != C2 && i10 != D10) {
                        a(i10, arrayList);
                    }
                }
            }
            str = null;
            C2 = AbstractC1705a.C(str);
            if (C2 != -1) {
            }
            D10 = AbstractC1705a.D(uri);
            if (D10 != -1) {
                a(D10, arrayList);
            }
            while (i7 < 16) {
            }
        } catch (Throwable th) {
            throw th;
        }
        return (InterfaceC1982j[]) arrayList.toArray(new InterfaceC1982j[arrayList.size()]);
    }
}
