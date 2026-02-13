package A4;

import A9.C0096i1;
import A9.C0098j;
import A9.C0139t1;
import Q.AbstractC0508p;
import Q.InterfaceC0482c;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.kt.apps.media.xemtv.beta.R;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import jb.InterfaceC1393d;
import m4.L;
import n5.AbstractC1705a;
import n5.D;
import u.C2066t;
import x.AbstractC2243m;
import x.C2252w;
import x.s0;

/* loaded from: classes.dex */
public final class h implements g, InterfaceC0482c, InterfaceC1393d, s0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f384a;

    /* renamed from: b, reason: collision with root package name */
    public int f385b;

    /* renamed from: c, reason: collision with root package name */
    public int f386c;

    /* renamed from: d, reason: collision with root package name */
    public Object f387d;

    public h(int i7) {
        this.f384a = i7;
        switch (i7) {
            case 7:
                int highestOneBit = Integer.bitCount(8) != 1 ? Integer.highestOneBit(7) << 1 : 8;
                this.f386c = highestOneBit - 1;
                this.f387d = new int[highestOneBit];
                return;
            default:
                return;
        }
    }

    public h(int i7, int i10) {
        this.f384a = 6;
        this.f387d = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i10, i7);
        this.f385b = i7;
        this.f386c = i10;
    }

    public h(int i7, int i10, SparseArray sparseArray) {
        this.f384a = 4;
        this.f385b = i7;
        this.f386c = i10;
        this.f387d = sparseArray;
    }

    public h(int i7, int i10, x.r rVar) {
        this.f384a = 9;
        this.f385b = i7;
        this.f386c = i10;
        this.f387d = new q3.i(new C2252w(i7, i10, rVar));
    }

    public h(int i7, va.u uVar, int i10) {
        this.f384a = 8;
        this.f385b = i7;
        this.f387d = uVar;
        this.f386c = i10;
    }

    public h(b bVar, L l10) {
        this.f384a = 0;
        n5.v vVar = bVar.f366c;
        this.f387d = vVar;
        vVar.G(12);
        int y10 = vVar.y();
        if ("audio/raw".equals(l10.f20096z)) {
            int z8 = D.z(l10.f20077O, l10.f20075M);
            if (y10 == 0 || y10 % z8 != 0) {
                AbstractC1705a.S("AtomParsers", "Audio sample size mismatch. stsd sample size: " + z8 + ", stsz sample size: " + y10);
                y10 = z8;
            }
        }
        this.f385b = y10 == 0 ? -1 : y10;
        this.f386c = vVar.y();
    }

    public h(InterfaceC0482c interfaceC0482c, int i7) {
        this.f384a = 3;
        this.f387d = interfaceC0482c;
        this.f385b = i7;
    }

    public h(Context context) {
        this.f384a = 2;
        this.f386c = 0;
        this.f387d = context;
    }

    public h(Context context, XmlResourceParser xmlResourceParser) {
        this.f384a = 5;
        this.f387d = new ArrayList();
        this.f386c = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), g1.q.f17428h);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i7 = 0; i7 < indexCount; i7++) {
            int index = obtainStyledAttributes.getIndex(i7);
            if (index == 0) {
                this.f385b = obtainStyledAttributes.getResourceId(index, this.f385b);
            } else if (index == 1) {
                int resourceId = obtainStyledAttributes.getResourceId(index, this.f386c);
                this.f386c = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new g1.n().b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            }
        }
        obtainStyledAttributes.recycle();
    }

    @Override // Q.InterfaceC0482c
    public void A() {
        if (!(this.f386c > 0)) {
            AbstractC0508p.c("OffsetApplier up called with no corresponding down");
        }
        this.f386c--;
        ((InterfaceC0482c) this.f387d).A();
    }

    @Override // A4.g
    public int a() {
        return this.f385b;
    }

    @Override // jb.InterfaceC1393d
    public void accept(Object obj) {
        List allBannerAds = (List) obj;
        kotlin.jvm.internal.l.e(allBannerAds, "allBannerAds");
        boolean isEmpty = allBannerAds.isEmpty();
        va.u t5 = (va.u) this.f387d;
        if (isEmpty) {
            kotlin.jvm.internal.l.e(t5, "t");
            return;
        }
        List v02 = Eb.o.v0(allBannerAds);
        Collections.shuffle(v02);
        if (this.f385b >= 2) {
            List o02 = Eb.o.o0(4, v02);
            if (!o02.isEmpty()) {
                Mc.a aVar = t5.f25360V0;
                String G9 = t5.G(R.string.header_ads_title);
                kotlin.jvm.internal.l.d(G9, "getString(...)");
                C0139t1 a9 = aVar.a(G9, o02);
                t5.G0().f(Math.min(2, t5.G0().f1233c.size()), a9);
            }
        }
        int i7 = this.f386c;
        if (i7 >= 2 && ((ArrayList) v02).size() > 4) {
            List o03 = Eb.o.o0(4, Eb.o.W(4, v02));
            if (!o03.isEmpty()) {
                Mc.a aVar2 = t5.f25360V0;
                aVar2.getClass();
                C0096i1 c0096i1 = new C0096i1("Sản phẩm khuyến mãi (nhỏ)", 0L);
                C0098j c0098j = new C0098j(aVar2.f6938b);
                Iterator it = o03.iterator();
                while (it.hasNext()) {
                    c0098j.g((Jc.a) it.next());
                }
                C0139t1 c0139t1 = new C0139t1(c0096i1, c0098j);
                t5.G0().f(Math.min((t5.G0().f1233c.size() / 2) + 2, t5.G0().f1233c.size()), c0139t1);
            }
        }
        if (i7 < 3 || ((ArrayList) v02).size() <= 8) {
            return;
        }
        List o04 = Eb.o.o0(4, Eb.o.W(8, v02));
        if (o04.isEmpty()) {
            return;
        }
        Mc.a aVar3 = t5.f25360V0;
        aVar3.getClass();
        C0096i1 c0096i12 = new C0096i1("Sản phẩm khuyến mãi (siêu nhỏ)", 0L);
        C0098j c0098j2 = new C0098j(aVar3.f6939c);
        Iterator it2 = o04.iterator();
        while (it2.hasNext()) {
            c0098j2.g((Jc.a) it2.next());
        }
        C0139t1 c0139t12 = new C0139t1(c0096i12, c0098j2);
        t5.G0().f(Math.min(((t5.G0().f1233c.size() * 3) / 4) + 1, t5.G0().f1233c.size()), c0139t12);
    }

    @Override // A4.g
    public int c() {
        return this.f386c;
    }

    @Override // x.q0
    public AbstractC2243m d(long j, AbstractC2243m abstractC2243m, AbstractC2243m abstractC2243m2, AbstractC2243m abstractC2243m3) {
        return ((q3.i) this.f387d).d(j, abstractC2243m, abstractC2243m2, abstractC2243m3);
    }

    @Override // Q.InterfaceC0482c
    public void e(int i7, Object obj) {
        ((InterfaceC0482c) this.f387d).e(i7 + (this.f386c == 0 ? this.f385b : 0), obj);
    }

    @Override // Q.InterfaceC0482c
    public void f(Object obj) {
        this.f386c++;
        ((InterfaceC0482c) this.f387d).f(obj);
    }

    @Override // x.q0
    public long h(AbstractC2243m abstractC2243m, AbstractC2243m abstractC2243m2, AbstractC2243m abstractC2243m3) {
        return (this.f386c + this.f385b) * 1000000;
    }

    @Override // A4.g
    public int i() {
        int i7 = this.f385b;
        return i7 == -1 ? ((n5.v) this.f387d).y() : i7;
    }

    @Override // Q.InterfaceC0482c
    public void j(int i7, Object obj) {
        ((InterfaceC0482c) this.f387d).j(i7 + (this.f386c == 0 ? this.f385b : 0), obj);
    }

    @Override // Q.InterfaceC0482c
    public void k(int i7, int i10, int i11) {
        int i12 = this.f386c == 0 ? this.f385b : 0;
        ((InterfaceC0482c) this.f387d).k(i7 + i12, i10 + i12, i11);
    }

    @Override // Q.InterfaceC0482c
    public Object l() {
        return ((InterfaceC0482c) this.f387d).l();
    }

    @Override // Q.InterfaceC0482c
    public void m(int i7, int i10) {
        ((InterfaceC0482c) this.f387d).m(i7 + (this.f386c == 0 ? this.f385b : 0), i10);
    }

    @Override // x.q0
    public AbstractC2243m n(long j, AbstractC2243m abstractC2243m, AbstractC2243m abstractC2243m2, AbstractC2243m abstractC2243m3) {
        return ((q3.i) this.f387d).n(j, abstractC2243m, abstractC2243m2, abstractC2243m3);
    }

    public void p(int i7) {
        int[] iArr = (int[]) this.f387d;
        int i10 = this.f385b;
        iArr[i10] = i7;
        int i11 = this.f386c & (i10 + 1);
        this.f385b = i11;
        if (i11 == 0) {
            int length = iArr.length;
            int i12 = length << 1;
            if (i12 < 0) {
                throw new RuntimeException("Max array capacity exceeded");
            }
            int[] iArr2 = new int[i12];
            Eb.n.M(0, 0, length, iArr, iArr2);
            Eb.n.M(length, 0, 0, (int[]) this.f387d, iArr2);
            this.f387d = iArr2;
            this.f385b = length;
            this.f386c = i12 - 1;
        }
    }

    public void q() {
        int i7 = this.f385b;
        if (i7 == 2) {
            if (this.f386c <= 0) {
                throw new IllegalArgumentException();
            }
            C2066t c2066t = (C2066t) this.f387d;
            if (c2066t == null || c2066t.maxSize() != this.f386c) {
                this.f387d = new C2066t(this.f386c);
                return;
            }
            return;
        }
        if (i7 != 3 && i7 != 1) {
            this.f387d = null;
            return;
        }
        C2066t c2066t2 = (C2066t) this.f387d;
        if (c2066t2 == null || c2066t2.maxSize() != Integer.MAX_VALUE) {
            this.f387d = new C2066t(com.google.android.gms.common.api.f.API_PRIORITY_OTHER);
        }
    }

    public byte r(int i7, int i10) {
        return ((byte[][]) this.f387d)[i10][i7];
    }

    public int s(int i7) {
        if (i7 < 0 || i7 >= u()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return ((int[]) this.f387d)[i7 & this.f386c];
    }

    public void t(int i7, int i10, int i11) {
        ((byte[][]) this.f387d)[i10][i7] = (byte) i11;
    }

    public String toString() {
        switch (this.f384a) {
            case 6:
                int i7 = this.f385b;
                int i10 = this.f386c;
                StringBuilder sb2 = new StringBuilder((i7 * 2 * i10) + 2);
                for (int i11 = 0; i11 < i10; i11++) {
                    byte[] bArr = ((byte[][]) this.f387d)[i11];
                    for (int i12 = 0; i12 < i7; i12++) {
                        byte b2 = bArr[i12];
                        if (b2 == 0) {
                            sb2.append(" 0");
                        } else if (b2 != 1) {
                            sb2.append("  ");
                        } else {
                            sb2.append(" 1");
                        }
                    }
                    sb2.append('\n');
                }
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public int u() {
        return this.f385b & this.f386c;
    }

    public synchronized int v() {
        PackageInfo packageInfo;
        if (this.f385b == 0) {
            try {
                packageInfo = O5.c.a((Context) this.f387d).h(0, "com.google.android.gms");
            } catch (PackageManager.NameNotFoundException e2) {
                Log.w("Metadata", "Failed to find package ".concat(e2.toString()));
                packageInfo = null;
            }
            if (packageInfo != null) {
                this.f385b = packageInfo.versionCode;
            }
        }
        return this.f385b;
    }

    public synchronized int w() {
        int i7 = this.f386c;
        if (i7 != 0) {
            return i7;
        }
        Context context = (Context) this.f387d;
        PackageManager packageManager = context.getPackageManager();
        if (O5.c.a(context).f3530b.getPackageManager().checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("Metadata", "Google Play services missing or without correct permission.");
            return 0;
        }
        int i10 = 1;
        if (!M5.c.f()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                this.f386c = i10;
                return i10;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers != null && !queryBroadcastReceivers.isEmpty()) {
            i10 = 2;
            this.f386c = i10;
            return i10;
        }
        Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
        if (true == M5.c.f()) {
            i10 = 2;
        }
        this.f386c = i10;
        return i10;
    }
}
