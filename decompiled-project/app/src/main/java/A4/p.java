package A4;

import A9.L1;
import C4.A;
import C4.C0239a;
import C4.C0241c;
import C4.C0242d;
import C4.C0244f;
import C4.D;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.firebase.database.DatabaseRegistrar;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import com.kt.apps.core.utils.blurry.BlurFactor;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import jb.InterfaceC1390a;
import jb.InterfaceC1391b;
import m5.InterfaceC1615l;
import m5.InterfaceC1616m;
import m5.V;
import n5.C1704A;
import s4.InterfaceC1982j;
import s4.InterfaceC1985m;
import y7.O0;

/* loaded from: classes.dex */
public final /* synthetic */ class p implements M6.i, InterfaceC1985m, p7.c, L1, C6.x, Y3.e, InterfaceC1615l, I8.o, K4.g, InterfaceC1390a, InterfaceC1391b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f445a;

    public /* synthetic */ p(int i7) {
        this.f445a = i7;
    }

    @Override // K4.g
    public boolean a(int i7, int i10, int i11, int i12, int i13) {
        return false;
    }

    @Override // M6.i, Y3.e
    public Object apply(Object obj) {
        switch (this.f445a) {
            case 0:
                return (v) obj;
            default:
                C7.a.f3038b.getClass();
                return z7.a.f28333a.u((O0) obj).getBytes(Charset.forName("UTF-8"));
        }
    }

    @Override // jb.InterfaceC1391b
    public Object apply(Object obj, Object obj2) {
        List t1 = (List) obj;
        List t22 = (List) obj2;
        kotlin.jvm.internal.l.e(t1, "t1");
        kotlin.jvm.internal.l.e(t22, "t2");
        ArrayList u02 = Eb.o.u0(t1);
        u02.addAll(t22);
        return u02;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s4.InterfaceC1985m
    public InterfaceC1982j[] c() {
        switch (this.f445a) {
            case 1:
                return new InterfaceC1982j[]{new r()};
            case 2:
            case 3:
            case 4:
            case 5:
            case 12:
            case 13:
            default:
                return new D[]{new D(1, new C1704A(0L), new C0244f(0))};
            case 6:
                return new InterfaceC1982j[]{new Object()};
            case 7:
                return new InterfaceC1982j[]{new C0239a()};
            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                return new InterfaceC1982j[]{new C0241c()};
            case 9:
                return new InterfaceC1982j[]{new C0242d()};
            case 10:
                return new InterfaceC1982j[]{new A()};
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                return new InterfaceC1982j[]{new D(1, new C1704A(0L), new C0244f(0))};
            case 14:
                return new InterfaceC1982j[]{new D4.d()};
        }
    }

    @Override // m5.InterfaceC1615l
    public InterfaceC1616m e() {
        return new V(3000, 100000);
    }

    @Override // p7.c
    public Object g(T6.a aVar) {
        switch (this.f445a) {
            case 3:
                return FirebaseSessionsRegistrar.b(aVar);
            case 4:
                return FirebaseSessionsRegistrar.a(aVar);
            default:
                return DatabaseRegistrar.a(aVar);
        }
    }

    @Override // I8.o
    public Object h() {
        switch (this.f445a) {
            case 18:
                return new LinkedHashMap();
            case 19:
                return new TreeMap();
            case 20:
                return new ConcurrentHashMap();
            case 21:
                return new ConcurrentSkipListMap();
            case 22:
                return new ArrayList();
            case 23:
                return new LinkedHashSet();
            case 24:
                return new TreeSet();
            case BlurFactor.DEFAULT_RADIUS /* 25 */:
                return new ArrayDeque();
            default:
                return new I8.n(true);
        }
    }

    @Override // A9.L1
    public void j(View view, int i7) {
        if (view == null || i7 < 0) {
            return;
        }
        view.requestFocus();
    }

    @Override // jb.InterfaceC1390a
    public void run() {
        Bundle bundle = Oa.g.f7538a;
        Oa.g.f7538a = com.bumptech.glide.c.e();
    }
}
