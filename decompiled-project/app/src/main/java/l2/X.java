package l2;

import B0.C0170c0;
import I2.C0330t;
import N6.H0;
import a3.C0723O;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessagingService;
import hb.InterfaceC1269b;
import ia.C1358d;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import kb.C1436a;
import kb.EnumC1437b;
import l1.AbstractC1449a;
import m4.AbstractC1571h;
import m4.C1558a0;
import m9.C1649f;
import m9.EnumC1647d;
import n5.AbstractC1705a;
import o4.C1800n;
import o4.InterfaceC1802p;
import org.json.JSONArray;
import org.json.JSONException;
import q7.AbstractC1904h;
import r4.C1934f;
import u0.C2075e;
import u0.C2080j;
import u0.C2085o;
import u0.C2086p;
import u0.EnumC2084n;
import v8.C2149c;
import v8.C2153g;
import v8.C2155i;
import y0.InterfaceC2345m;

/* loaded from: classes.dex */
public class X implements r4.r, gb.q, zc.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19193a;

    /* renamed from: b, reason: collision with root package name */
    public Object f19194b;

    /* renamed from: c, reason: collision with root package name */
    public Object f19195c;

    /* renamed from: d, reason: collision with root package name */
    public Object f19196d;

    public X() {
        this.f19193a = 6;
        this.f19194b = new Object();
    }

    public /* synthetic */ X(int i7) {
        this.f19193a = i7;
    }

    public X(R7.c cVar, C1649f c1649f, o9.d dVar) {
        EnumC1647d enumC1647d;
        int i7;
        int i10;
        int i11;
        int i12;
        this.f19193a = 5;
        this.f19196d = cVar;
        this.f19194b = new ArrayList();
        o9.d dVar2 = dVar;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            enumC1647d = EnumC1647d.ECI;
            if (dVar2 == null) {
                break;
            }
            int i15 = i13 + dVar2.f22137d;
            EnumC1647d enumC1647d2 = EnumC1647d.BYTE;
            EnumC1647d enumC1647d3 = dVar2.f22134a;
            int i16 = dVar2.f22136c;
            o9.d dVar3 = dVar2.f22138e;
            boolean z8 = (enumC1647d3 == enumC1647d2 && dVar3 == null && i16 != 0) || !(dVar3 == null || i16 == dVar3.f22136c);
            i7 = z8 ? 1 : i14;
            if (dVar3 == null || dVar3.f22134a != enumC1647d3 || z8) {
                i11 = i7;
                ((ArrayList) this.f19194b).add(0, new o9.e(this, enumC1647d3, dVar2.f22135b, i16, i15));
                i12 = 0;
            } else {
                i11 = i7;
                i12 = i15;
            }
            if (z8) {
                ((ArrayList) this.f19194b).add(0, new o9.e(this, enumC1647d, dVar2.f22135b, dVar2.f22136c, 0));
            }
            i14 = i11;
            i13 = i12;
            dVar2 = dVar3;
        }
        if (cVar.f8932c) {
            o9.e eVar = (o9.e) ((ArrayList) this.f19194b).get(0);
            if (eVar != null && eVar.f22140a != enumC1647d && i14 != 0) {
                ((ArrayList) this.f19194b).add(0, new o9.e(this, enumC1647d, 0, 0, 0));
            }
            ((ArrayList) this.f19194b).add(((o9.e) ((ArrayList) this.f19194b).get(0)).f22140a == enumC1647d ? 1 : 0, new o9.e(this, EnumC1647d.FNC1_FIRST_POSITION, 0, 0, 0));
        }
        int i17 = c1649f.f20808a;
        int i18 = 26;
        int b2 = P.c.b(i17 <= 9 ? 1 : i17 <= 26 ? 2 : 3);
        if (b2 == 0) {
            i18 = 9;
        } else if (b2 != 1) {
            i7 = 27;
            i18 = 40;
        } else {
            i7 = 10;
        }
        int q10 = q(c1649f);
        while (true) {
            i10 = cVar.f8931b;
            if (i17 >= i18 || o9.b.c(q10, C1649f.c(i17), i10)) {
                break;
            } else {
                i17++;
            }
        }
        while (i17 > i7 && o9.b.c(q10, C1649f.c(i17 - 1), i10)) {
            i17--;
        }
        this.f19195c = C1649f.c(i17);
    }

    public X(Y6.i iVar, k8.e eVar, C2153g c2153g, C2149c c2149c, Context context, v8.k kVar, ScheduledExecutorService scheduledExecutorService) {
        this.f19193a = 12;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f19194b = linkedHashSet;
        this.f19195c = new C2155i(iVar, eVar, c2153g, c2149c, context, linkedHashSet, kVar, scheduledExecutorService);
        this.f19196d = scheduledExecutorService;
    }

    public X(Context context, TypedArray typedArray) {
        this.f19193a = 2;
        this.f19194b = context;
        this.f19195c = typedArray;
    }

    public X(FirebaseMessagingService firebaseMessagingService, C1358d c1358d, ExecutorService executorService) {
        this.f19193a = 7;
        this.f19194b = executorService;
        this.f19195c = firebaseMessagingService;
        this.f19196d = c1358d;
    }

    public /* synthetic */ X(Object obj, Object obj2, Object obj3, int i7) {
        this.f19193a = i7;
        this.f19194b = obj;
        this.f19195c = obj2;
        this.f19196d = obj3;
    }

    public X(Runnable runnable) {
        this.f19193a = 15;
        this.f19195c = new CopyOnWriteArrayList();
        this.f19196d = new HashMap();
        this.f19194b = runnable;
    }

    public X(AbstractServiceC1450A abstractServiceC1450A) {
        this.f19193a = 0;
        this.f19194b = new C1481z(abstractServiceC1450A);
        this.f19195c = new Handler();
    }

    public X(o4.I i7) {
        this.f19193a = 4;
        this.f19196d = i7;
        this.f19195c = new Handler(Looper.myLooper());
        this.f19194b = new o4.H(this);
    }

    public X(t6.b bVar, View view) {
        this.f19193a = 8;
        int i7 = Build.VERSION.SDK_INT;
        this.f19194b = i7 >= 34 ? new Object() : i7 >= 33 ? new Object() : null;
        this.f19195c = bVar;
        this.f19196d = view;
    }

    public X(tb.c cVar, C1436a c1436a, gb.q qVar) {
        this.f19193a = 9;
        this.f19196d = cVar;
        this.f19194b = c1436a;
        this.f19195c = qVar;
    }

    public X(C2086p c2086p) {
        this.f19193a = 10;
        this.f19196d = c2086p;
        this.f19195c = EnumC2084n.f24786a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [o4.P, java.lang.Object] */
    public X(InterfaceC1802p[] interfaceC1802pArr) {
        this.f19193a = 3;
        o4.N n6 = new o4.N();
        ?? obj = new Object();
        obj.f21799c = 1.0f;
        obj.f21800d = 1.0f;
        C1800n c1800n = C1800n.f21866e;
        obj.f21801e = c1800n;
        obj.f21802f = c1800n;
        obj.g = c1800n;
        obj.f21803h = c1800n;
        ByteBuffer byteBuffer = InterfaceC1802p.f21871a;
        obj.k = byteBuffer;
        obj.f21805l = byteBuffer.asShortBuffer();
        obj.f21806m = byteBuffer;
        obj.f21798b = -1;
        InterfaceC1802p[] interfaceC1802pArr2 = new InterfaceC1802p[interfaceC1802pArr.length + 2];
        this.f19194b = interfaceC1802pArr2;
        System.arraycopy(interfaceC1802pArr, 0, interfaceC1802pArr2, 0, interfaceC1802pArr.length);
        this.f19195c = n6;
        this.f19196d = obj;
        interfaceC1802pArr2[interfaceC1802pArr.length] = n6;
        interfaceC1802pArr2[interfaceC1802pArr.length + 1] = obj;
    }

    public static C1934f k(m4.T t5) {
        C0723O c0723o = new C0723O();
        c0723o.f12522f = null;
        Uri uri = t5.f20150b;
        C0330t c0330t = new C0330t(uri == null ? null : uri.toString(), t5.f20154f, c0723o);
        H0 it = t5.f20151c.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            str.getClass();
            str2.getClass();
            synchronized (((HashMap) c0330t.f5202d)) {
                ((HashMap) c0330t.f5202d).put(str, str2);
            }
        }
        HashMap hashMap = new HashMap();
        UUID uuid = AbstractC1571h.f20382a;
        Y5.B b2 = new Y5.B(14);
        UUID uuid2 = t5.f20149a;
        uuid2.getClass();
        boolean z8 = t5.f20152d;
        boolean z10 = t5.f20153e;
        int[] G9 = h3.H.G(t5.f20155u);
        int length = G9.length;
        for (int i7 = 0; i7 < length; i7++) {
            int i10 = G9[i7];
            AbstractC1705a.h(i10 == 2 || i10 == 1);
        }
        C1934f c1934f = new C1934f(uuid2, c0330t, hashMap, z8, (int[]) G9.clone(), z10, b2);
        byte[] bArr = t5.f20156v;
        byte[] copyOf = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
        AbstractC1705a.m(c1934f.f23744m.isEmpty());
        c1934f.f23753v = copyOf;
        return c1934f;
    }

    public static X t(Context context, AttributeSet attributeSet, int[] iArr) {
        return new X(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static X u(Context context, AttributeSet attributeSet, int[] iArr, int i7) {
        return new X(context, context.obtainStyledAttributes(attributeSet, iArr, i7, 0));
    }

    @Override // zc.u
    public void a(xc.q qVar, int i7) {
        if (qVar.getClass() == xc.x.class) {
            i((xc.x) qVar, 0, i7);
        } else if (qVar instanceof xc.l) {
            b((xc.l) qVar, i7);
        } else {
            f((xc.p) qVar, i7);
        }
    }

    public void b(xc.l lVar, int i7) {
        lVar.R((wc.c) this.f19195c, (xc.f) this.f19196d);
    }

    @Override // gb.q
    public void c(InterfaceC1269b interfaceC1269b) {
        C1436a c1436a = (C1436a) this.f19194b;
        c1436a.getClass();
        EnumC1437b.f(c1436a, interfaceC1269b);
    }

    @Override // zc.u
    public void d(xc.q qVar, int i7) {
        if (qVar instanceof xc.l) {
            g((xc.l) qVar, i7);
        }
    }

    @Override // r4.r
    public r4.q e(C1558a0 c1558a0) {
        C1934f c1934f;
        c1558a0.f20224b.getClass();
        m4.T t5 = c1558a0.f20224b.f20179c;
        if (t5 == null || n5.D.f21141a < 18) {
            return r4.q.f23775a;
        }
        synchronized (this.f19194b) {
            try {
                if (!t5.equals((m4.T) this.f19195c)) {
                    this.f19195c = t5;
                    this.f19196d = k(t5);
                }
                c1934f = (C1934f) this.f19196d;
                c1934f.getClass();
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1934f;
    }

    public void f(xc.p pVar, int i7) {
        pVar.R((wc.c) this.f19195c, (xc.f) this.f19196d);
    }

    public void g(xc.l lVar, int i7) {
        lVar.k0((wc.c) this.f19195c, (xc.f) this.f19196d);
    }

    public void i(xc.x xVar, int i7, int i10) {
        String Z7 = xVar.Z();
        xc.f fVar = (xc.f) this.f19196d;
        xc.n.c((wc.c) this.f19195c, Z7, fVar, i7 | 1);
    }

    public synchronized void j() {
        if (!((LinkedHashSet) this.f19194b).isEmpty()) {
            ((C2155i) this.f19195c).e(0L);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List, java.util.Collection, java.lang.Object] */
    public void l(C2075e c2075e) {
        ?? r02 = c2075e.f24754a;
        int size = r02.size();
        int i7 = 0;
        while (true) {
            C2086p c2086p = (C2086p) this.f19196d;
            if (i7 >= size) {
                InterfaceC2345m interfaceC2345m = (InterfaceC2345m) this.f19194b;
                if (interfaceC2345m == null) {
                    throw new IllegalStateException("layoutCoordinates not set");
                }
                u0.u.g(c2075e, interfaceC2345m.A(0L), new C0170c0(25, this, c2086p), false);
                if (((EnumC2084n) this.f19195c) == EnumC2084n.f24787b) {
                    int size2 = r02.size();
                    for (int i10 = 0; i10 < size2; i10++) {
                        ((C2080j) r02.get(i10)).a();
                    }
                    P3.p pVar = c2075e.f24755b;
                    if (pVar == null) {
                        return;
                    }
                    pVar.f7841b = !c2086p.f24794c;
                    return;
                }
                return;
            }
            if (((C2080j) r02.get(i7)).b()) {
                if (((EnumC2084n) this.f19195c) == EnumC2084n.f24787b) {
                    InterfaceC2345m interfaceC2345m2 = (InterfaceC2345m) this.f19194b;
                    if (interfaceC2345m2 == null) {
                        throw new IllegalStateException("layoutCoordinates not set");
                    }
                    u0.u.g(c2075e, interfaceC2345m2.A(0L), new C2085o(c2086p, 0), true);
                }
                this.f19195c = EnumC2084n.f24788c;
                return;
            }
            i7++;
        }
    }

    public ColorStateList m(int i7) {
        int resourceId;
        ColorStateList colorStateList;
        TypedArray typedArray = (TypedArray) this.f19195c;
        return (!typedArray.hasValue(i7) || (resourceId = typedArray.getResourceId(i7, 0)) == 0 || (colorStateList = AbstractC1449a.getColorStateList((Context) this.f19194b, resourceId)) == null) ? typedArray.getColorStateList(i7) : colorStateList;
    }

    public Drawable n(int i7) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f19195c;
        return (!typedArray.hasValue(i7) || (resourceId = typedArray.getResourceId(i7, 0)) == 0) ? typedArray.getDrawable(i7) : Q5.e.x((Context) this.f19194b, resourceId);
    }

    public Drawable o(int i7) {
        int resourceId;
        Drawable d10;
        if (!((TypedArray) this.f19195c).hasValue(i7) || (resourceId = ((TypedArray) this.f19195c).getResourceId(i7, 0)) == 0) {
            return null;
        }
        o.r a9 = o.r.a();
        Context context = (Context) this.f19194b;
        synchronized (a9) {
            d10 = a9.f21581a.d(context, resourceId, true);
        }
        return d10;
    }

    @Override // gb.q
    public void onError(Throwable th) {
        tb.c cVar = (tb.c) this.f19196d;
        EnumC1437b.f((C1436a) this.f19194b, cVar.f24530d.c(new hc.i(13, this, th), 0L, cVar.f24529c));
    }

    @Override // gb.q
    public void onSuccess(Object obj) {
        tb.c cVar = (tb.c) this.f19196d;
        EnumC1437b.f((C1436a) this.f19194b, cVar.f24530d.c(new hc.i(14, this, obj), cVar.f24528b, cVar.f24529c));
    }

    public Typeface p(int i7, int i10, o.N n6) {
        int resourceId = ((TypedArray) this.f19195c).getResourceId(i7, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.f19196d) == null) {
            this.f19196d = new TypedValue();
        }
        TypedValue typedValue = (TypedValue) this.f19196d;
        ThreadLocal threadLocal = n1.k.f21047a;
        Context context = (Context) this.f19194b;
        if (context.isRestricted()) {
            return null;
        }
        return n1.k.a(context, resourceId, typedValue, i10, n6, true, false);
    }

    public int q(C1649f c1649f) {
        Iterator it = ((ArrayList) this.f19194b).iterator();
        int i7 = 0;
        while (it.hasNext()) {
            o9.e eVar = (o9.e) it.next();
            EnumC1647d enumC1647d = eVar.f22140a;
            int a9 = enumC1647d.a(c1649f);
            int i10 = a9 + 4;
            int ordinal = enumC1647d.ordinal();
            int i11 = eVar.f22143d;
            if (ordinal != 1) {
                if (ordinal == 2) {
                    i10 = ((i11 / 2) * 11) + i10 + (i11 % 2 != 1 ? 0 : 6);
                } else if (ordinal == 4) {
                    i10 += eVar.a() * 8;
                } else if (ordinal == 5) {
                    i10 = a9 + 12;
                } else if (ordinal == 6) {
                    i10 += i11 * 13;
                }
            } else {
                int i12 = ((i11 / 3) * 10) + i10;
                int i13 = i11 % 3;
                i10 = i12 + (i13 != 1 ? i13 == 2 ? 7 : 0 : 4);
            }
            i7 += i10;
        }
        return i7;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(88:5|(2:7|(2:9|(2:10|(2:12|(3:14|15|(1:17)(0))(1:18))(1:19)))(0))(0)|20|(85:281|282|(1:24)|25|26|27|(1:29)|278|31|32|(3:253|254|(80:256|(72:258|(1:260)|35|(1:37)|38|(1:40)|41|(63:43|(1:238)|47|(1:49)|50|(1:52)(2:228|(1:233)(1:232))|53|(1:55)|56|(1:58)(5:216|(1:218)|219|(1:221)(1:227)|(1:223)(2:224|(1:226)))|59|(1:61)(6:198|(4:201|(2:209|210)(1:207)|208|199)|211|212|(1:214)|215)|62|(1:64)(1:197)|(1:66)|67|(45:193|194|(1:73)|74|(1:76)(1:188)|77|(1:79)|80|(37:183|(1:187)|(1:84)|85|(33:178|(1:182)|(1:89)|90|(29:175|(1:177)|(1:94)|95|(25:171|172|(1:99)|100|(3:161|162|(22:164|(1:166)|167|(1:104)|105|(4:146|147|148|(2:150|(16:152|(3:109|(1:114)(1:112)|113)|115|(1:117)|118|(1:120)(1:145)|121|(1:123)|124|(1:144)|126|(4:133|134|(1:136)(1:139)|137)|128|(1:130)|131|132)(2:153|154))(2:155|156))|107|(0)|115|(0)|118|(0)(0)|121|(0)|124|(0)|126|(0)|128|(0)|131|132)(2:168|169))|102|(0)|105|(0)|107|(0)|115|(0)|118|(0)(0)|121|(0)|124|(0)|126|(0)|128|(0)|131|132)|97|(0)|100|(0)|102|(0)|105|(0)|107|(0)|115|(0)|118|(0)(0)|121|(0)|124|(0)|126|(0)|128|(0)|131|132)|92|(0)|95|(0)|97|(0)|100|(0)|102|(0)|105|(0)|107|(0)|115|(0)|118|(0)(0)|121|(0)|124|(0)|126|(0)|128|(0)|131|132)|87|(0)|90|(0)|92|(0)|95|(0)|97|(0)|100|(0)|102|(0)|105|(0)|107|(0)|115|(0)|118|(0)(0)|121|(0)|124|(0)|126|(0)|128|(0)|131|132)|82|(0)|85|(0)|87|(0)|90|(0)|92|(0)|95|(0)|97|(0)|100|(0)|102|(0)|105|(0)|107|(0)|115|(0)|118|(0)(0)|121|(0)|124|(0)|126|(0)|128|(0)|131|132)|69|(45:189|190|(0)|74|(0)(0)|77|(0)|80|(0)|82|(0)|85|(0)|87|(0)|90|(0)|92|(0)|95|(0)|97|(0)|100|(0)|102|(0)|105|(0)|107|(0)|115|(0)|118|(0)(0)|121|(0)|124|(0)|126|(0)|128|(0)|131|132)|71|(0)|74|(0)(0)|77|(0)|80|(0)|82|(0)|85|(0)|87|(0)|90|(0)|92|(0)|95|(0)|97|(0)|100|(0)|102|(0)|105|(0)|107|(0)|115|(0)|118|(0)(0)|121|(0)|124|(0)|126|(0)|128|(0)|131|132)|239|(2:248|249)|(1:247)(1:246)|47|(0)|50|(0)(0)|53|(0)|56|(0)(0)|59|(0)(0)|62|(0)(0)|(0)|67|(0)|69|(0)|71|(0)|74|(0)(0)|77|(0)|80|(0)|82|(0)|85|(0)|87|(0)|90|(0)|92|(0)|95|(0)|97|(0)|100|(0)|102|(0)|105|(0)|107|(0)|115|(0)|118|(0)(0)|121|(0)|124|(0)|126|(0)|128|(0)|131|132)|261|(75:263|(1:265)|35|(0)|38|(0)|41|(0)|239|(1:241)|248|249|(1:244)|247|47|(0)|50|(0)(0)|53|(0)|56|(0)(0)|59|(0)(0)|62|(0)(0)|(0)|67|(0)|69|(0)|71|(0)|74|(0)(0)|77|(0)|80|(0)|82|(0)|85|(0)|87|(0)|90|(0)|92|(0)|95|(0)|97|(0)|100|(0)|102|(0)|105|(0)|107|(0)|115|(0)|118|(0)(0)|121|(0)|124|(0)|126|(0)|128|(0)|131|132)(1:274)|266|(3:268|(1:270)(1:272)|271)|273|35|(0)|38|(0)|41|(0)|239|(0)|248|249|(0)|247|47|(0)|50|(0)(0)|53|(0)|56|(0)(0)|59|(0)(0)|62|(0)(0)|(0)|67|(0)|69|(0)|71|(0)|74|(0)(0)|77|(0)|80|(0)|82|(0)|85|(0)|87|(0)|90|(0)|92|(0)|95|(0)|97|(0)|100|(0)|102|(0)|105|(0)|107|(0)|115|(0)|118|(0)(0)|121|(0)|124|(0)|126|(0)|128|(0)|131|132))|34|35|(0)|38|(0)|41|(0)|239|(0)|248|249|(0)|247|47|(0)|50|(0)(0)|53|(0)|56|(0)(0)|59|(0)(0)|62|(0)(0)|(0)|67|(0)|69|(0)|71|(0)|74|(0)(0)|77|(0)|80|(0)|82|(0)|85|(0)|87|(0)|90|(0)|92|(0)|95|(0)|97|(0)|100|(0)|102|(0)|105|(0)|107|(0)|115|(0)|118|(0)(0)|121|(0)|124|(0)|126|(0)|128|(0)|131|132)|22|(0)|25|26|27|(0)|278|31|32|(0)|34|35|(0)|38|(0)|41|(0)|239|(0)|248|249|(0)|247|47|(0)|50|(0)(0)|53|(0)|56|(0)(0)|59|(0)(0)|62|(0)(0)|(0)|67|(0)|69|(0)|71|(0)|74|(0)(0)|77|(0)|80|(0)|82|(0)|85|(0)|87|(0)|90|(0)|92|(0)|95|(0)|97|(0)|100|(0)|102|(0)|105|(0)|107|(0)|115|(0)|118|(0)(0)|121|(0)|124|(0)|126|(0)|128|(0)|131|132) */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x0206, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x0207, code lost:
    
        android.util.Log.w("FirebaseMessaging", "Couldn't get own application info: " + r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x00c5, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x00c6, code lost:
    
        android.util.Log.w("FirebaseMessaging", "Couldn't get own application info: " + r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c1, code lost:
    
        if (r0 != null) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0524  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x05a2  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x05cd  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x05d7  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x05e2  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0671  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x060c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x05f6  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x05da  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0537  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x04eb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x04a8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x03b7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0390 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x00e7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bf A[Catch: NameNotFoundException -> 0x00c5, TRY_LEAVE, TryCatch #3 {NameNotFoundException -> 0x00c5, blocks: (B:27:0x00b9, B:29:0x00bf), top: B:26:0x00b9 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0496  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x04d6  */
    /* JADX WARN: Type inference failed for: r0v126, types: [int] */
    /* JADX WARN: Type inference failed for: r0v151 */
    /* JADX WARN: Type inference failed for: r0v206 */
    /* JADX WARN: Type inference failed for: r0v207 */
    /* JADX WARN: Type inference failed for: r15v3, types: [k1.q] */
    /* JADX WARN: Type inference failed for: r3v21, types: [k1.n, java.lang.Object, C9.h] */
    /* JADX WARN: Type inference failed for: r4v48, types: [k1.o, java.lang.Object, C9.h] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean r() {
        r8.k kVar;
        FirebaseMessagingService firebaseMessagingService;
        C1358d c1358d;
        Bundle bundle;
        NotificationChannel notificationChannel;
        String string;
        NotificationChannel notificationChannel2;
        NotificationChannel notificationChannel3;
        String packageName;
        PackageManager packageManager;
        String l10;
        String l11;
        String m10;
        int i7;
        int i10;
        String m11;
        Uri defaultUri;
        String m12;
        Intent launchIntentForPackage;
        PendingIntent activity;
        PendingIntent broadcast;
        String m13;
        Integer valueOf;
        boolean i11;
        String m14;
        Integer j;
        Integer j10;
        Integer j11;
        String m15;
        Long valueOf2;
        JSONArray k;
        long[] jArr;
        JSONArray k7;
        int[] iArr;
        char c10;
        ?? r02;
        String m16;
        IconCompat iconCompat;
        boolean z8;
        int i12;
        ApplicationInfo applicationInfo;
        if (((C1358d) this.f19196d).i("gcm.n.noui")) {
            return true;
        }
        FirebaseMessagingService firebaseMessagingService2 = (FirebaseMessagingService) this.f19195c;
        if (!((KeyguardManager) firebaseMessagingService2.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            int myPid = Process.myPid();
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) firebaseMessagingService2.getSystemService("activity")).getRunningAppProcesses();
            if (runningAppProcesses != null) {
                Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    ActivityManager.RunningAppProcessInfo next = it.next();
                    if (next.pid == myPid) {
                        if (next.importance == 100) {
                            return false;
                        }
                    }
                }
            }
        }
        String m17 = ((C1358d) this.f19196d).m("gcm.n.image");
        if (!TextUtils.isEmpty(m17)) {
            try {
                kVar = new r8.k(new URL(m17));
            } catch (MalformedURLException unused) {
                Log.w("FirebaseMessaging", "Not downloading image, bad URL: " + m17);
            }
            if (kVar != null) {
                ExecutorService executorService = (ExecutorService) this.f19194b;
                TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                kVar.f23847b = executorService.submit(new p5.j(10, kVar, taskCompletionSource));
                kVar.f23848c = taskCompletionSource.getTask();
            }
            firebaseMessagingService = (FirebaseMessagingService) this.f19195c;
            c1358d = (C1358d) this.f19196d;
            AtomicInteger atomicInteger = r8.e.f23831a;
            applicationInfo = firebaseMessagingService.getPackageManager().getApplicationInfo(firebaseMessagingService.getPackageName(), 128);
            if (applicationInfo != null) {
                bundle = applicationInfo.metaData;
            }
            bundle = Bundle.EMPTY;
            Bundle bundle2 = bundle;
            String m18 = c1358d.m("gcm.n.android_channel_id");
            if (Build.VERSION.SDK_INT >= 26) {
                if (firebaseMessagingService.getPackageManager().getApplicationInfo(firebaseMessagingService.getPackageName(), 0).targetSdkVersion >= 26) {
                    NotificationManager notificationManager = (NotificationManager) firebaseMessagingService.getSystemService(NotificationManager.class);
                    if (!TextUtils.isEmpty(m18)) {
                        notificationChannel3 = notificationManager.getNotificationChannel(m18);
                        if (notificationChannel3 == null) {
                            Log.w("FirebaseMessaging", "Notification Channel requested (" + m18 + ") has not been created by the app. Manifest configuration, or default, value will be used.");
                        }
                        packageName = firebaseMessagingService.getPackageName();
                        Resources resources = firebaseMessagingService.getResources();
                        packageManager = firebaseMessagingService.getPackageManager();
                        ?? qVar = new k1.q(firebaseMessagingService, m18);
                        l10 = c1358d.l(resources, packageName, "gcm.n.title");
                        if (!TextUtils.isEmpty(l10)) {
                            qVar.f18789e = k1.q.b(l10);
                        }
                        l11 = c1358d.l(resources, packageName, "gcm.n.body");
                        if (!TextUtils.isEmpty(l11)) {
                            qVar.f18790f = k1.q.b(l11);
                            ?? obj = new Object();
                            obj.f18784b = k1.q.b(l11);
                            qVar.d(obj);
                        }
                        m10 = c1358d.m("gcm.n.icon");
                        if (!TextUtils.isEmpty(m10)) {
                            i10 = resources.getIdentifier(m10, "drawable", packageName);
                            if ((i10 == 0 || !r8.e.a(resources, i10)) && ((i10 = resources.getIdentifier(m10, "mipmap", packageName)) == 0 || !r8.e.a(resources, i10))) {
                                Log.w("FirebaseMessaging", "Icon resource " + m10 + " not found. Notification will use default icon.");
                            }
                            qVar.f18800s.icon = i10;
                            m11 = c1358d.m("gcm.n.sound2");
                            if (TextUtils.isEmpty(m11)) {
                                m11 = c1358d.m("gcm.n.sound");
                            }
                            if (!TextUtils.isEmpty(m11)) {
                                defaultUri = null;
                            } else if ("default".equals(m11) || resources.getIdentifier(m11, "raw", packageName) == 0) {
                                defaultUri = RingtoneManager.getDefaultUri(2);
                            } else {
                                defaultUri = Uri.parse("android.resource://" + packageName + "/raw/" + m11);
                            }
                            if (defaultUri != null) {
                                Notification notification = qVar.f18800s;
                                notification.sound = defaultUri;
                                notification.audioStreamType = -1;
                                notification.audioAttributes = k1.p.a(k1.p.d(k1.p.c(k1.p.b(), 4), 5));
                            }
                            m12 = c1358d.m("gcm.n.click_action");
                            if (TextUtils.isEmpty(m12)) {
                                launchIntentForPackage = new Intent(m12);
                                launchIntentForPackage.setPackage(packageName);
                                launchIntentForPackage.setFlags(268435456);
                            } else {
                                String m19 = c1358d.m("gcm.n.link_android");
                                if (TextUtils.isEmpty(m19)) {
                                    m19 = c1358d.m("gcm.n.link");
                                }
                                Uri parse = !TextUtils.isEmpty(m19) ? Uri.parse(m19) : null;
                                if (parse != null) {
                                    launchIntentForPackage = new Intent("android.intent.action.VIEW");
                                    launchIntentForPackage.setPackage(packageName);
                                    launchIntentForPackage.setData(parse);
                                } else {
                                    launchIntentForPackage = packageManager.getLaunchIntentForPackage(packageName);
                                    if (launchIntentForPackage == null) {
                                        Log.w("FirebaseMessaging", "No activity found to launch app");
                                    }
                                }
                            }
                            AtomicInteger atomicInteger2 = r8.e.f23831a;
                            if (launchIntentForPackage != null) {
                                activity = null;
                            } else {
                                launchIntentForPackage.addFlags(67108864);
                                Bundle bundle3 = (Bundle) c1358d.f18487b;
                                Bundle bundle4 = new Bundle(bundle3);
                                for (String str : bundle3.keySet()) {
                                    if (str.startsWith("google.c.") || str.startsWith("gcm.n.") || str.startsWith("gcm.notification.")) {
                                        bundle4.remove(str);
                                    }
                                }
                                launchIntentForPackage.putExtras(bundle4);
                                if (c1358d.i("google.c.a.e")) {
                                    launchIntentForPackage.putExtra("gcm.n.analytics_data", c1358d.r());
                                }
                                activity = PendingIntent.getActivity(firebaseMessagingService, atomicInteger2.incrementAndGet(), launchIntentForPackage, 1140850688);
                            }
                            qVar.g = activity;
                            broadcast = c1358d.i("google.c.a.e") ? null : PendingIntent.getBroadcast(firebaseMessagingService, atomicInteger2.incrementAndGet(), new Intent("com.google.android.c2dm.intent.RECEIVE").setPackage(firebaseMessagingService.getPackageName()).putExtra("wrapped_intent", new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(c1358d.r())), 1140850688);
                            if (broadcast != null) {
                                qVar.f18800s.deleteIntent = broadcast;
                            }
                            m13 = c1358d.m("gcm.n.color");
                            if (!TextUtils.isEmpty(m13)) {
                                try {
                                    valueOf = Integer.valueOf(Color.parseColor(m13));
                                } catch (IllegalArgumentException unused2) {
                                    Log.w("FirebaseMessaging", "Color is invalid: " + m13 + ". Notification will use default color.");
                                }
                                if (valueOf != null) {
                                    qVar.f18796o = valueOf.intValue();
                                }
                                i11 = c1358d.i("gcm.n.sticky");
                                Notification notification2 = qVar.f18800s;
                                if (i11) {
                                    notification2.flags |= 16;
                                } else {
                                    notification2.flags &= -17;
                                }
                                qVar.f18794m = c1358d.i("gcm.n.local_only");
                                m14 = c1358d.m("gcm.n.ticker");
                                if (m14 != null) {
                                    qVar.f18800s.tickerText = k1.q.b(m14);
                                }
                                j = c1358d.j("gcm.n.notification_priority");
                                if (j != null) {
                                    if (j.intValue() < -2 || j.intValue() > 2) {
                                        Log.w("FirebaseMessaging", "notificationPriority is invalid " + j + ". Skipping setting notificationPriority.");
                                    }
                                    if (j != null) {
                                        qVar.j = j.intValue();
                                    }
                                    j10 = c1358d.j("gcm.n.visibility");
                                    if (j10 != null) {
                                        if (j10.intValue() < -1 || j10.intValue() > 1) {
                                            Log.w("NotificationParams", "visibility is invalid: " + j10 + ". Skipping setting visibility.");
                                        }
                                        if (j10 != null) {
                                            qVar.f18797p = j10.intValue();
                                        }
                                        j11 = c1358d.j("gcm.n.notification_count");
                                        if (j11 != null) {
                                            if (j11.intValue() < 0) {
                                                Log.w("FirebaseMessaging", "notificationCount is invalid: " + j11 + ". Skipping setting notificationCount.");
                                            }
                                            if (j11 != null) {
                                                qVar.f18792i = j11.intValue();
                                            }
                                            m15 = c1358d.m("gcm.n.event_time");
                                            if (!TextUtils.isEmpty(m15)) {
                                                try {
                                                    valueOf2 = Long.valueOf(Long.parseLong(m15));
                                                } catch (NumberFormatException unused3) {
                                                    Log.w("NotificationParams", "Couldn't parse value of " + C1358d.v("gcm.n.event_time") + "(" + m15 + ") into a long");
                                                }
                                                if (valueOf2 != null) {
                                                    qVar.k = true;
                                                    qVar.f18800s.when = valueOf2.longValue();
                                                }
                                                k = c1358d.k("gcm.n.vibrate_timings");
                                                if (k != null) {
                                                    try {
                                                    } catch (NumberFormatException | JSONException unused4) {
                                                        Log.w("NotificationParams", "User defined vibrateTimings is invalid: " + k + ". Skipping setting vibrateTimings.");
                                                    }
                                                    if (k.length() <= 1) {
                                                        throw new JSONException("vibrateTimings have invalid length");
                                                    }
                                                    int length = k.length();
                                                    jArr = new long[length];
                                                    for (int i13 = 0; i13 < length; i13++) {
                                                        jArr[i13] = k.optLong(i13);
                                                    }
                                                    if (jArr != null) {
                                                        qVar.f18800s.vibrate = jArr;
                                                    }
                                                    k7 = c1358d.k("gcm.n.light_settings");
                                                    if (k7 != null) {
                                                        iArr = new int[3];
                                                        try {
                                                        } catch (IllegalArgumentException e2) {
                                                            Log.w("NotificationParams", "LightSettings is invalid: " + k7 + ". " + e2.getMessage() + ". Skipping setting LightSettings");
                                                        } catch (JSONException unused5) {
                                                            Log.w("NotificationParams", "LightSettings is invalid: " + k7 + ". Skipping setting LightSettings");
                                                        }
                                                        if (k7.length() != 3) {
                                                            throw new JSONException("lightSettings don't have all three fields");
                                                        }
                                                        int parseColor = Color.parseColor(k7.optString(0));
                                                        if (parseColor == -16777216) {
                                                            throw new IllegalArgumentException("Transparent color is invalid");
                                                        }
                                                        iArr[0] = parseColor;
                                                        iArr[1] = k7.optInt(1);
                                                        iArr[2] = k7.optInt(2);
                                                        if (iArr != null) {
                                                            int i14 = iArr[0];
                                                            int i15 = iArr[1];
                                                            int i16 = iArr[2];
                                                            Notification notification3 = qVar.f18800s;
                                                            notification3.ledARGB = i14;
                                                            notification3.ledOnMS = i15;
                                                            notification3.ledOffMS = i16;
                                                            notification3.flags = ((i15 == 0 || i16 == 0) ? 0 : 1) | ((-2) & notification3.flags);
                                                        }
                                                        boolean i17 = c1358d.i("gcm.n.default_sound");
                                                        boolean z10 = i17;
                                                        if (c1358d.i("gcm.n.default_vibrate_timings")) {
                                                            z10 = (i17 ? 1 : 0) | 2;
                                                        }
                                                        if (c1358d.i("gcm.n.default_light_settings")) {
                                                            c10 = 4;
                                                            r02 = z10;
                                                        } else {
                                                            c10 = 4;
                                                            r02 = (z10 ? 1 : 0) | 4;
                                                        }
                                                        Notification notification4 = qVar.f18800s;
                                                        notification4.defaults = r02;
                                                        if ((r02 & c10) != 0) {
                                                            notification4.flags |= 1;
                                                        }
                                                        m16 = c1358d.m("gcm.n.tag");
                                                        if (TextUtils.isEmpty(m16)) {
                                                            m16 = "FCM-Notification:" + SystemClock.uptimeMillis();
                                                        }
                                                        String str2 = m16;
                                                        if (kVar != null) {
                                                            try {
                                                                Task task = kVar.f23848c;
                                                                com.google.android.gms.common.internal.G.g(task);
                                                                Bitmap bitmap = (Bitmap) Tasks.await(task, 5L, TimeUnit.SECONDS);
                                                                qVar.c(bitmap);
                                                                ?? obj2 = new Object();
                                                                if (bitmap == null) {
                                                                    iconCompat = null;
                                                                    z8 = true;
                                                                } else {
                                                                    z8 = true;
                                                                    iconCompat = new IconCompat(1);
                                                                    iconCompat.f13276b = bitmap;
                                                                }
                                                                obj2.f18781b = iconCompat;
                                                                obj2.f18782c = null;
                                                                obj2.f18783d = z8;
                                                                qVar.d(obj2);
                                                            } catch (InterruptedException unused6) {
                                                                Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
                                                                kVar.close();
                                                                Thread.currentThread().interrupt();
                                                            } catch (ExecutionException e10) {
                                                                Log.w("FirebaseMessaging", "Failed to download image: " + e10.getCause());
                                                            } catch (TimeoutException unused7) {
                                                                Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
                                                                kVar.close();
                                                            }
                                                        }
                                                        if (Log.isLoggable("FirebaseMessaging", 3)) {
                                                            Log.d("FirebaseMessaging", "Showing notification");
                                                        }
                                                        ((NotificationManager) ((FirebaseMessagingService) this.f19195c).getSystemService("notification")).notify(str2, 0, qVar.a());
                                                        return true;
                                                    }
                                                    iArr = null;
                                                    if (iArr != null) {
                                                    }
                                                    boolean i172 = c1358d.i("gcm.n.default_sound");
                                                    boolean z102 = i172;
                                                    if (c1358d.i("gcm.n.default_vibrate_timings")) {
                                                    }
                                                    if (c1358d.i("gcm.n.default_light_settings")) {
                                                    }
                                                    Notification notification42 = qVar.f18800s;
                                                    notification42.defaults = r02;
                                                    if ((r02 & c10) != 0) {
                                                    }
                                                    m16 = c1358d.m("gcm.n.tag");
                                                    if (TextUtils.isEmpty(m16)) {
                                                    }
                                                    String str22 = m16;
                                                    if (kVar != null) {
                                                    }
                                                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                                                    }
                                                    ((NotificationManager) ((FirebaseMessagingService) this.f19195c).getSystemService("notification")).notify(str22, 0, qVar.a());
                                                    return true;
                                                }
                                                jArr = null;
                                                if (jArr != null) {
                                                }
                                                k7 = c1358d.k("gcm.n.light_settings");
                                                if (k7 != null) {
                                                }
                                                iArr = null;
                                                if (iArr != null) {
                                                }
                                                boolean i1722 = c1358d.i("gcm.n.default_sound");
                                                boolean z1022 = i1722;
                                                if (c1358d.i("gcm.n.default_vibrate_timings")) {
                                                }
                                                if (c1358d.i("gcm.n.default_light_settings")) {
                                                }
                                                Notification notification422 = qVar.f18800s;
                                                notification422.defaults = r02;
                                                if ((r02 & c10) != 0) {
                                                }
                                                m16 = c1358d.m("gcm.n.tag");
                                                if (TextUtils.isEmpty(m16)) {
                                                }
                                                String str222 = m16;
                                                if (kVar != null) {
                                                }
                                                if (Log.isLoggable("FirebaseMessaging", 3)) {
                                                }
                                                ((NotificationManager) ((FirebaseMessagingService) this.f19195c).getSystemService("notification")).notify(str222, 0, qVar.a());
                                                return true;
                                            }
                                            valueOf2 = null;
                                            if (valueOf2 != null) {
                                            }
                                            k = c1358d.k("gcm.n.vibrate_timings");
                                            if (k != null) {
                                            }
                                            jArr = null;
                                            if (jArr != null) {
                                            }
                                            k7 = c1358d.k("gcm.n.light_settings");
                                            if (k7 != null) {
                                            }
                                            iArr = null;
                                            if (iArr != null) {
                                            }
                                            boolean i17222 = c1358d.i("gcm.n.default_sound");
                                            boolean z10222 = i17222;
                                            if (c1358d.i("gcm.n.default_vibrate_timings")) {
                                            }
                                            if (c1358d.i("gcm.n.default_light_settings")) {
                                            }
                                            Notification notification4222 = qVar.f18800s;
                                            notification4222.defaults = r02;
                                            if ((r02 & c10) != 0) {
                                            }
                                            m16 = c1358d.m("gcm.n.tag");
                                            if (TextUtils.isEmpty(m16)) {
                                            }
                                            String str2222 = m16;
                                            if (kVar != null) {
                                            }
                                            if (Log.isLoggable("FirebaseMessaging", 3)) {
                                            }
                                            ((NotificationManager) ((FirebaseMessagingService) this.f19195c).getSystemService("notification")).notify(str2222, 0, qVar.a());
                                            return true;
                                        }
                                        j11 = null;
                                        if (j11 != null) {
                                        }
                                        m15 = c1358d.m("gcm.n.event_time");
                                        if (!TextUtils.isEmpty(m15)) {
                                        }
                                        valueOf2 = null;
                                        if (valueOf2 != null) {
                                        }
                                        k = c1358d.k("gcm.n.vibrate_timings");
                                        if (k != null) {
                                        }
                                        jArr = null;
                                        if (jArr != null) {
                                        }
                                        k7 = c1358d.k("gcm.n.light_settings");
                                        if (k7 != null) {
                                        }
                                        iArr = null;
                                        if (iArr != null) {
                                        }
                                        boolean i172222 = c1358d.i("gcm.n.default_sound");
                                        boolean z102222 = i172222;
                                        if (c1358d.i("gcm.n.default_vibrate_timings")) {
                                        }
                                        if (c1358d.i("gcm.n.default_light_settings")) {
                                        }
                                        Notification notification42222 = qVar.f18800s;
                                        notification42222.defaults = r02;
                                        if ((r02 & c10) != 0) {
                                        }
                                        m16 = c1358d.m("gcm.n.tag");
                                        if (TextUtils.isEmpty(m16)) {
                                        }
                                        String str22222 = m16;
                                        if (kVar != null) {
                                        }
                                        if (Log.isLoggable("FirebaseMessaging", 3)) {
                                        }
                                        ((NotificationManager) ((FirebaseMessagingService) this.f19195c).getSystemService("notification")).notify(str22222, 0, qVar.a());
                                        return true;
                                    }
                                    j10 = null;
                                    if (j10 != null) {
                                    }
                                    j11 = c1358d.j("gcm.n.notification_count");
                                    if (j11 != null) {
                                    }
                                    j11 = null;
                                    if (j11 != null) {
                                    }
                                    m15 = c1358d.m("gcm.n.event_time");
                                    if (!TextUtils.isEmpty(m15)) {
                                    }
                                    valueOf2 = null;
                                    if (valueOf2 != null) {
                                    }
                                    k = c1358d.k("gcm.n.vibrate_timings");
                                    if (k != null) {
                                    }
                                    jArr = null;
                                    if (jArr != null) {
                                    }
                                    k7 = c1358d.k("gcm.n.light_settings");
                                    if (k7 != null) {
                                    }
                                    iArr = null;
                                    if (iArr != null) {
                                    }
                                    boolean i1722222 = c1358d.i("gcm.n.default_sound");
                                    boolean z1022222 = i1722222;
                                    if (c1358d.i("gcm.n.default_vibrate_timings")) {
                                    }
                                    if (c1358d.i("gcm.n.default_light_settings")) {
                                    }
                                    Notification notification422222 = qVar.f18800s;
                                    notification422222.defaults = r02;
                                    if ((r02 & c10) != 0) {
                                    }
                                    m16 = c1358d.m("gcm.n.tag");
                                    if (TextUtils.isEmpty(m16)) {
                                    }
                                    String str222222 = m16;
                                    if (kVar != null) {
                                    }
                                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                                    }
                                    ((NotificationManager) ((FirebaseMessagingService) this.f19195c).getSystemService("notification")).notify(str222222, 0, qVar.a());
                                    return true;
                                }
                                j = null;
                                if (j != null) {
                                }
                                j10 = c1358d.j("gcm.n.visibility");
                                if (j10 != null) {
                                }
                                j10 = null;
                                if (j10 != null) {
                                }
                                j11 = c1358d.j("gcm.n.notification_count");
                                if (j11 != null) {
                                }
                                j11 = null;
                                if (j11 != null) {
                                }
                                m15 = c1358d.m("gcm.n.event_time");
                                if (!TextUtils.isEmpty(m15)) {
                                }
                                valueOf2 = null;
                                if (valueOf2 != null) {
                                }
                                k = c1358d.k("gcm.n.vibrate_timings");
                                if (k != null) {
                                }
                                jArr = null;
                                if (jArr != null) {
                                }
                                k7 = c1358d.k("gcm.n.light_settings");
                                if (k7 != null) {
                                }
                                iArr = null;
                                if (iArr != null) {
                                }
                                boolean i17222222 = c1358d.i("gcm.n.default_sound");
                                boolean z10222222 = i17222222;
                                if (c1358d.i("gcm.n.default_vibrate_timings")) {
                                }
                                if (c1358d.i("gcm.n.default_light_settings")) {
                                }
                                Notification notification4222222 = qVar.f18800s;
                                notification4222222.defaults = r02;
                                if ((r02 & c10) != 0) {
                                }
                                m16 = c1358d.m("gcm.n.tag");
                                if (TextUtils.isEmpty(m16)) {
                                }
                                String str2222222 = m16;
                                if (kVar != null) {
                                }
                                if (Log.isLoggable("FirebaseMessaging", 3)) {
                                }
                                ((NotificationManager) ((FirebaseMessagingService) this.f19195c).getSystemService("notification")).notify(str2222222, 0, qVar.a());
                                return true;
                            }
                            i12 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
                            if (i12 != 0) {
                                try {
                                    valueOf = Integer.valueOf(AbstractC1449a.getColor(firebaseMessagingService, i12));
                                } catch (Resources.NotFoundException unused8) {
                                    Log.w("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
                                }
                                if (valueOf != null) {
                                }
                                i11 = c1358d.i("gcm.n.sticky");
                                Notification notification22 = qVar.f18800s;
                                if (i11) {
                                }
                                qVar.f18794m = c1358d.i("gcm.n.local_only");
                                m14 = c1358d.m("gcm.n.ticker");
                                if (m14 != null) {
                                }
                                j = c1358d.j("gcm.n.notification_priority");
                                if (j != null) {
                                }
                                j = null;
                                if (j != null) {
                                }
                                j10 = c1358d.j("gcm.n.visibility");
                                if (j10 != null) {
                                }
                                j10 = null;
                                if (j10 != null) {
                                }
                                j11 = c1358d.j("gcm.n.notification_count");
                                if (j11 != null) {
                                }
                                j11 = null;
                                if (j11 != null) {
                                }
                                m15 = c1358d.m("gcm.n.event_time");
                                if (!TextUtils.isEmpty(m15)) {
                                }
                                valueOf2 = null;
                                if (valueOf2 != null) {
                                }
                                k = c1358d.k("gcm.n.vibrate_timings");
                                if (k != null) {
                                }
                                jArr = null;
                                if (jArr != null) {
                                }
                                k7 = c1358d.k("gcm.n.light_settings");
                                if (k7 != null) {
                                }
                                iArr = null;
                                if (iArr != null) {
                                }
                                boolean i172222222 = c1358d.i("gcm.n.default_sound");
                                boolean z102222222 = i172222222;
                                if (c1358d.i("gcm.n.default_vibrate_timings")) {
                                }
                                if (c1358d.i("gcm.n.default_light_settings")) {
                                }
                                Notification notification42222222 = qVar.f18800s;
                                notification42222222.defaults = r02;
                                if ((r02 & c10) != 0) {
                                }
                                m16 = c1358d.m("gcm.n.tag");
                                if (TextUtils.isEmpty(m16)) {
                                }
                                String str22222222 = m16;
                                if (kVar != null) {
                                }
                                if (Log.isLoggable("FirebaseMessaging", 3)) {
                                }
                                ((NotificationManager) ((FirebaseMessagingService) this.f19195c).getSystemService("notification")).notify(str22222222, 0, qVar.a());
                                return true;
                            }
                            valueOf = null;
                            if (valueOf != null) {
                            }
                            i11 = c1358d.i("gcm.n.sticky");
                            Notification notification222 = qVar.f18800s;
                            if (i11) {
                            }
                            qVar.f18794m = c1358d.i("gcm.n.local_only");
                            m14 = c1358d.m("gcm.n.ticker");
                            if (m14 != null) {
                            }
                            j = c1358d.j("gcm.n.notification_priority");
                            if (j != null) {
                            }
                            j = null;
                            if (j != null) {
                            }
                            j10 = c1358d.j("gcm.n.visibility");
                            if (j10 != null) {
                            }
                            j10 = null;
                            if (j10 != null) {
                            }
                            j11 = c1358d.j("gcm.n.notification_count");
                            if (j11 != null) {
                            }
                            j11 = null;
                            if (j11 != null) {
                            }
                            m15 = c1358d.m("gcm.n.event_time");
                            if (!TextUtils.isEmpty(m15)) {
                            }
                            valueOf2 = null;
                            if (valueOf2 != null) {
                            }
                            k = c1358d.k("gcm.n.vibrate_timings");
                            if (k != null) {
                            }
                            jArr = null;
                            if (jArr != null) {
                            }
                            k7 = c1358d.k("gcm.n.light_settings");
                            if (k7 != null) {
                            }
                            iArr = null;
                            if (iArr != null) {
                            }
                            boolean i1722222222 = c1358d.i("gcm.n.default_sound");
                            boolean z1022222222 = i1722222222;
                            if (c1358d.i("gcm.n.default_vibrate_timings")) {
                            }
                            if (c1358d.i("gcm.n.default_light_settings")) {
                            }
                            Notification notification422222222 = qVar.f18800s;
                            notification422222222.defaults = r02;
                            if ((r02 & c10) != 0) {
                            }
                            m16 = c1358d.m("gcm.n.tag");
                            if (TextUtils.isEmpty(m16)) {
                            }
                            String str222222222 = m16;
                            if (kVar != null) {
                            }
                            if (Log.isLoggable("FirebaseMessaging", 3)) {
                            }
                            ((NotificationManager) ((FirebaseMessagingService) this.f19195c).getSystemService("notification")).notify(str222222222, 0, qVar.a());
                            return true;
                        }
                        i7 = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
                        if (i7 != 0 || !r8.e.a(resources, i7)) {
                            i7 = packageManager.getApplicationInfo(packageName, 0).icon;
                        }
                        i10 = (i7 == 0 && r8.e.a(resources, i7)) ? i7 : 17301651;
                        qVar.f18800s.icon = i10;
                        m11 = c1358d.m("gcm.n.sound2");
                        if (TextUtils.isEmpty(m11)) {
                        }
                        if (!TextUtils.isEmpty(m11)) {
                        }
                        if (defaultUri != null) {
                        }
                        m12 = c1358d.m("gcm.n.click_action");
                        if (TextUtils.isEmpty(m12)) {
                        }
                        AtomicInteger atomicInteger22 = r8.e.f23831a;
                        if (launchIntentForPackage != null) {
                        }
                        qVar.g = activity;
                        if (c1358d.i("google.c.a.e")) {
                        }
                        if (broadcast != null) {
                        }
                        m13 = c1358d.m("gcm.n.color");
                        if (!TextUtils.isEmpty(m13)) {
                        }
                        i12 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
                        if (i12 != 0) {
                        }
                        valueOf = null;
                        if (valueOf != null) {
                        }
                        i11 = c1358d.i("gcm.n.sticky");
                        Notification notification2222 = qVar.f18800s;
                        if (i11) {
                        }
                        qVar.f18794m = c1358d.i("gcm.n.local_only");
                        m14 = c1358d.m("gcm.n.ticker");
                        if (m14 != null) {
                        }
                        j = c1358d.j("gcm.n.notification_priority");
                        if (j != null) {
                        }
                        j = null;
                        if (j != null) {
                        }
                        j10 = c1358d.j("gcm.n.visibility");
                        if (j10 != null) {
                        }
                        j10 = null;
                        if (j10 != null) {
                        }
                        j11 = c1358d.j("gcm.n.notification_count");
                        if (j11 != null) {
                        }
                        j11 = null;
                        if (j11 != null) {
                        }
                        m15 = c1358d.m("gcm.n.event_time");
                        if (!TextUtils.isEmpty(m15)) {
                        }
                        valueOf2 = null;
                        if (valueOf2 != null) {
                        }
                        k = c1358d.k("gcm.n.vibrate_timings");
                        if (k != null) {
                        }
                        jArr = null;
                        if (jArr != null) {
                        }
                        k7 = c1358d.k("gcm.n.light_settings");
                        if (k7 != null) {
                        }
                        iArr = null;
                        if (iArr != null) {
                        }
                        boolean i17222222222 = c1358d.i("gcm.n.default_sound");
                        boolean z10222222222 = i17222222222;
                        if (c1358d.i("gcm.n.default_vibrate_timings")) {
                        }
                        if (c1358d.i("gcm.n.default_light_settings")) {
                        }
                        Notification notification4222222222 = qVar.f18800s;
                        notification4222222222.defaults = r02;
                        if ((r02 & c10) != 0) {
                        }
                        m16 = c1358d.m("gcm.n.tag");
                        if (TextUtils.isEmpty(m16)) {
                        }
                        String str2222222222 = m16;
                        if (kVar != null) {
                        }
                        if (Log.isLoggable("FirebaseMessaging", 3)) {
                        }
                        ((NotificationManager) ((FirebaseMessagingService) this.f19195c).getSystemService("notification")).notify(str2222222222, 0, qVar.a());
                        return true;
                    }
                    m18 = bundle2.getString("com.google.firebase.messaging.default_notification_channel_id");
                    if (!TextUtils.isEmpty(m18)) {
                        notificationChannel2 = notificationManager.getNotificationChannel(m18);
                        if (notificationChannel2 == null) {
                            Log.w("FirebaseMessaging", "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
                        }
                        packageName = firebaseMessagingService.getPackageName();
                        Resources resources2 = firebaseMessagingService.getResources();
                        packageManager = firebaseMessagingService.getPackageManager();
                        ?? qVar2 = new k1.q(firebaseMessagingService, m18);
                        l10 = c1358d.l(resources2, packageName, "gcm.n.title");
                        if (!TextUtils.isEmpty(l10)) {
                        }
                        l11 = c1358d.l(resources2, packageName, "gcm.n.body");
                        if (!TextUtils.isEmpty(l11)) {
                        }
                        m10 = c1358d.m("gcm.n.icon");
                        if (!TextUtils.isEmpty(m10)) {
                        }
                        i7 = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
                        if (i7 != 0) {
                        }
                        i7 = packageManager.getApplicationInfo(packageName, 0).icon;
                        if (i7 == 0) {
                        }
                        qVar2.f18800s.icon = i10;
                        m11 = c1358d.m("gcm.n.sound2");
                        if (TextUtils.isEmpty(m11)) {
                        }
                        if (!TextUtils.isEmpty(m11)) {
                        }
                        if (defaultUri != null) {
                        }
                        m12 = c1358d.m("gcm.n.click_action");
                        if (TextUtils.isEmpty(m12)) {
                        }
                        AtomicInteger atomicInteger222 = r8.e.f23831a;
                        if (launchIntentForPackage != null) {
                        }
                        qVar2.g = activity;
                        if (c1358d.i("google.c.a.e")) {
                        }
                        if (broadcast != null) {
                        }
                        m13 = c1358d.m("gcm.n.color");
                        if (!TextUtils.isEmpty(m13)) {
                        }
                        i12 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
                        if (i12 != 0) {
                        }
                        valueOf = null;
                        if (valueOf != null) {
                        }
                        i11 = c1358d.i("gcm.n.sticky");
                        Notification notification22222 = qVar2.f18800s;
                        if (i11) {
                        }
                        qVar2.f18794m = c1358d.i("gcm.n.local_only");
                        m14 = c1358d.m("gcm.n.ticker");
                        if (m14 != null) {
                        }
                        j = c1358d.j("gcm.n.notification_priority");
                        if (j != null) {
                        }
                        j = null;
                        if (j != null) {
                        }
                        j10 = c1358d.j("gcm.n.visibility");
                        if (j10 != null) {
                        }
                        j10 = null;
                        if (j10 != null) {
                        }
                        j11 = c1358d.j("gcm.n.notification_count");
                        if (j11 != null) {
                        }
                        j11 = null;
                        if (j11 != null) {
                        }
                        m15 = c1358d.m("gcm.n.event_time");
                        if (!TextUtils.isEmpty(m15)) {
                        }
                        valueOf2 = null;
                        if (valueOf2 != null) {
                        }
                        k = c1358d.k("gcm.n.vibrate_timings");
                        if (k != null) {
                        }
                        jArr = null;
                        if (jArr != null) {
                        }
                        k7 = c1358d.k("gcm.n.light_settings");
                        if (k7 != null) {
                        }
                        iArr = null;
                        if (iArr != null) {
                        }
                        boolean i172222222222 = c1358d.i("gcm.n.default_sound");
                        boolean z102222222222 = i172222222222;
                        if (c1358d.i("gcm.n.default_vibrate_timings")) {
                        }
                        if (c1358d.i("gcm.n.default_light_settings")) {
                        }
                        Notification notification42222222222 = qVar2.f18800s;
                        notification42222222222.defaults = r02;
                        if ((r02 & c10) != 0) {
                        }
                        m16 = c1358d.m("gcm.n.tag");
                        if (TextUtils.isEmpty(m16)) {
                        }
                        String str22222222222 = m16;
                        if (kVar != null) {
                        }
                        if (Log.isLoggable("FirebaseMessaging", 3)) {
                        }
                        ((NotificationManager) ((FirebaseMessagingService) this.f19195c).getSystemService("notification")).notify(str22222222222, 0, qVar2.a());
                        return true;
                    }
                    Log.w("FirebaseMessaging", "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
                    notificationChannel = notificationManager.getNotificationChannel("fcm_fallback_notification_channel");
                    if (notificationChannel == null) {
                        int identifier = firebaseMessagingService.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", firebaseMessagingService.getPackageName());
                        if (identifier == 0) {
                            Log.e("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                            string = "Misc";
                        } else {
                            string = firebaseMessagingService.getString(identifier);
                        }
                        notificationManager.createNotificationChannel(AbstractC1904h.d(string));
                    }
                    m18 = "fcm_fallback_notification_channel";
                    packageName = firebaseMessagingService.getPackageName();
                    Resources resources22 = firebaseMessagingService.getResources();
                    packageManager = firebaseMessagingService.getPackageManager();
                    ?? qVar22 = new k1.q(firebaseMessagingService, m18);
                    l10 = c1358d.l(resources22, packageName, "gcm.n.title");
                    if (!TextUtils.isEmpty(l10)) {
                    }
                    l11 = c1358d.l(resources22, packageName, "gcm.n.body");
                    if (!TextUtils.isEmpty(l11)) {
                    }
                    m10 = c1358d.m("gcm.n.icon");
                    if (!TextUtils.isEmpty(m10)) {
                    }
                    i7 = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
                    if (i7 != 0) {
                    }
                    i7 = packageManager.getApplicationInfo(packageName, 0).icon;
                    if (i7 == 0) {
                    }
                    qVar22.f18800s.icon = i10;
                    m11 = c1358d.m("gcm.n.sound2");
                    if (TextUtils.isEmpty(m11)) {
                    }
                    if (!TextUtils.isEmpty(m11)) {
                    }
                    if (defaultUri != null) {
                    }
                    m12 = c1358d.m("gcm.n.click_action");
                    if (TextUtils.isEmpty(m12)) {
                    }
                    AtomicInteger atomicInteger2222 = r8.e.f23831a;
                    if (launchIntentForPackage != null) {
                    }
                    qVar22.g = activity;
                    if (c1358d.i("google.c.a.e")) {
                    }
                    if (broadcast != null) {
                    }
                    m13 = c1358d.m("gcm.n.color");
                    if (!TextUtils.isEmpty(m13)) {
                    }
                    i12 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
                    if (i12 != 0) {
                    }
                    valueOf = null;
                    if (valueOf != null) {
                    }
                    i11 = c1358d.i("gcm.n.sticky");
                    Notification notification222222 = qVar22.f18800s;
                    if (i11) {
                    }
                    qVar22.f18794m = c1358d.i("gcm.n.local_only");
                    m14 = c1358d.m("gcm.n.ticker");
                    if (m14 != null) {
                    }
                    j = c1358d.j("gcm.n.notification_priority");
                    if (j != null) {
                    }
                    j = null;
                    if (j != null) {
                    }
                    j10 = c1358d.j("gcm.n.visibility");
                    if (j10 != null) {
                    }
                    j10 = null;
                    if (j10 != null) {
                    }
                    j11 = c1358d.j("gcm.n.notification_count");
                    if (j11 != null) {
                    }
                    j11 = null;
                    if (j11 != null) {
                    }
                    m15 = c1358d.m("gcm.n.event_time");
                    if (!TextUtils.isEmpty(m15)) {
                    }
                    valueOf2 = null;
                    if (valueOf2 != null) {
                    }
                    k = c1358d.k("gcm.n.vibrate_timings");
                    if (k != null) {
                    }
                    jArr = null;
                    if (jArr != null) {
                    }
                    k7 = c1358d.k("gcm.n.light_settings");
                    if (k7 != null) {
                    }
                    iArr = null;
                    if (iArr != null) {
                    }
                    boolean i1722222222222 = c1358d.i("gcm.n.default_sound");
                    boolean z1022222222222 = i1722222222222;
                    if (c1358d.i("gcm.n.default_vibrate_timings")) {
                    }
                    if (c1358d.i("gcm.n.default_light_settings")) {
                    }
                    Notification notification422222222222 = qVar22.f18800s;
                    notification422222222222.defaults = r02;
                    if ((r02 & c10) != 0) {
                    }
                    m16 = c1358d.m("gcm.n.tag");
                    if (TextUtils.isEmpty(m16)) {
                    }
                    String str222222222222 = m16;
                    if (kVar != null) {
                    }
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                    }
                    ((NotificationManager) ((FirebaseMessagingService) this.f19195c).getSystemService("notification")).notify(str222222222222, 0, qVar22.a());
                    return true;
                }
            }
            m18 = null;
            packageName = firebaseMessagingService.getPackageName();
            Resources resources222 = firebaseMessagingService.getResources();
            packageManager = firebaseMessagingService.getPackageManager();
            ?? qVar222 = new k1.q(firebaseMessagingService, m18);
            l10 = c1358d.l(resources222, packageName, "gcm.n.title");
            if (!TextUtils.isEmpty(l10)) {
            }
            l11 = c1358d.l(resources222, packageName, "gcm.n.body");
            if (!TextUtils.isEmpty(l11)) {
            }
            m10 = c1358d.m("gcm.n.icon");
            if (!TextUtils.isEmpty(m10)) {
            }
            i7 = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
            if (i7 != 0) {
            }
            i7 = packageManager.getApplicationInfo(packageName, 0).icon;
            if (i7 == 0) {
            }
            qVar222.f18800s.icon = i10;
            m11 = c1358d.m("gcm.n.sound2");
            if (TextUtils.isEmpty(m11)) {
            }
            if (!TextUtils.isEmpty(m11)) {
            }
            if (defaultUri != null) {
            }
            m12 = c1358d.m("gcm.n.click_action");
            if (TextUtils.isEmpty(m12)) {
            }
            AtomicInteger atomicInteger22222 = r8.e.f23831a;
            if (launchIntentForPackage != null) {
            }
            qVar222.g = activity;
            if (c1358d.i("google.c.a.e")) {
            }
            if (broadcast != null) {
            }
            m13 = c1358d.m("gcm.n.color");
            if (!TextUtils.isEmpty(m13)) {
            }
            i12 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
            if (i12 != 0) {
            }
            valueOf = null;
            if (valueOf != null) {
            }
            i11 = c1358d.i("gcm.n.sticky");
            Notification notification2222222 = qVar222.f18800s;
            if (i11) {
            }
            qVar222.f18794m = c1358d.i("gcm.n.local_only");
            m14 = c1358d.m("gcm.n.ticker");
            if (m14 != null) {
            }
            j = c1358d.j("gcm.n.notification_priority");
            if (j != null) {
            }
            j = null;
            if (j != null) {
            }
            j10 = c1358d.j("gcm.n.visibility");
            if (j10 != null) {
            }
            j10 = null;
            if (j10 != null) {
            }
            j11 = c1358d.j("gcm.n.notification_count");
            if (j11 != null) {
            }
            j11 = null;
            if (j11 != null) {
            }
            m15 = c1358d.m("gcm.n.event_time");
            if (!TextUtils.isEmpty(m15)) {
            }
            valueOf2 = null;
            if (valueOf2 != null) {
            }
            k = c1358d.k("gcm.n.vibrate_timings");
            if (k != null) {
            }
            jArr = null;
            if (jArr != null) {
            }
            k7 = c1358d.k("gcm.n.light_settings");
            if (k7 != null) {
            }
            iArr = null;
            if (iArr != null) {
            }
            boolean i17222222222222 = c1358d.i("gcm.n.default_sound");
            boolean z10222222222222 = i17222222222222;
            if (c1358d.i("gcm.n.default_vibrate_timings")) {
            }
            if (c1358d.i("gcm.n.default_light_settings")) {
            }
            Notification notification4222222222222 = qVar222.f18800s;
            notification4222222222222.defaults = r02;
            if ((r02 & c10) != 0) {
            }
            m16 = c1358d.m("gcm.n.tag");
            if (TextUtils.isEmpty(m16)) {
            }
            String str2222222222222 = m16;
            if (kVar != null) {
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
            }
            ((NotificationManager) ((FirebaseMessagingService) this.f19195c).getSystemService("notification")).notify(str2222222222222, 0, qVar222.a());
            return true;
        }
        kVar = null;
        if (kVar != null) {
        }
        firebaseMessagingService = (FirebaseMessagingService) this.f19195c;
        c1358d = (C1358d) this.f19196d;
        AtomicInteger atomicInteger3 = r8.e.f23831a;
        applicationInfo = firebaseMessagingService.getPackageManager().getApplicationInfo(firebaseMessagingService.getPackageName(), 128);
        if (applicationInfo != null) {
        }
        bundle = Bundle.EMPTY;
        Bundle bundle22 = bundle;
        String m182 = c1358d.m("gcm.n.android_channel_id");
        if (Build.VERSION.SDK_INT >= 26) {
        }
        m182 = null;
        packageName = firebaseMessagingService.getPackageName();
        Resources resources2222 = firebaseMessagingService.getResources();
        packageManager = firebaseMessagingService.getPackageManager();
        ?? qVar2222 = new k1.q(firebaseMessagingService, m182);
        l10 = c1358d.l(resources2222, packageName, "gcm.n.title");
        if (!TextUtils.isEmpty(l10)) {
        }
        l11 = c1358d.l(resources2222, packageName, "gcm.n.body");
        if (!TextUtils.isEmpty(l11)) {
        }
        m10 = c1358d.m("gcm.n.icon");
        if (!TextUtils.isEmpty(m10)) {
        }
        i7 = bundle22.getInt("com.google.firebase.messaging.default_notification_icon", 0);
        if (i7 != 0) {
        }
        i7 = packageManager.getApplicationInfo(packageName, 0).icon;
        if (i7 == 0) {
        }
        qVar2222.f18800s.icon = i10;
        m11 = c1358d.m("gcm.n.sound2");
        if (TextUtils.isEmpty(m11)) {
        }
        if (!TextUtils.isEmpty(m11)) {
        }
        if (defaultUri != null) {
        }
        m12 = c1358d.m("gcm.n.click_action");
        if (TextUtils.isEmpty(m12)) {
        }
        AtomicInteger atomicInteger222222 = r8.e.f23831a;
        if (launchIntentForPackage != null) {
        }
        qVar2222.g = activity;
        if (c1358d.i("google.c.a.e")) {
        }
        if (broadcast != null) {
        }
        m13 = c1358d.m("gcm.n.color");
        if (!TextUtils.isEmpty(m13)) {
        }
        i12 = bundle22.getInt("com.google.firebase.messaging.default_notification_color", 0);
        if (i12 != 0) {
        }
        valueOf = null;
        if (valueOf != null) {
        }
        i11 = c1358d.i("gcm.n.sticky");
        Notification notification22222222 = qVar2222.f18800s;
        if (i11) {
        }
        qVar2222.f18794m = c1358d.i("gcm.n.local_only");
        m14 = c1358d.m("gcm.n.ticker");
        if (m14 != null) {
        }
        j = c1358d.j("gcm.n.notification_priority");
        if (j != null) {
        }
        j = null;
        if (j != null) {
        }
        j10 = c1358d.j("gcm.n.visibility");
        if (j10 != null) {
        }
        j10 = null;
        if (j10 != null) {
        }
        j11 = c1358d.j("gcm.n.notification_count");
        if (j11 != null) {
        }
        j11 = null;
        if (j11 != null) {
        }
        m15 = c1358d.m("gcm.n.event_time");
        if (!TextUtils.isEmpty(m15)) {
        }
        valueOf2 = null;
        if (valueOf2 != null) {
        }
        k = c1358d.k("gcm.n.vibrate_timings");
        if (k != null) {
        }
        jArr = null;
        if (jArr != null) {
        }
        k7 = c1358d.k("gcm.n.light_settings");
        if (k7 != null) {
        }
        iArr = null;
        if (iArr != null) {
        }
        boolean i172222222222222 = c1358d.i("gcm.n.default_sound");
        boolean z102222222222222 = i172222222222222;
        if (c1358d.i("gcm.n.default_vibrate_timings")) {
        }
        if (c1358d.i("gcm.n.default_light_settings")) {
        }
        Notification notification42222222222222 = qVar2222.f18800s;
        notification42222222222222.defaults = r02;
        if ((r02 & c10) != 0) {
        }
        m16 = c1358d.m("gcm.n.tag");
        if (TextUtils.isEmpty(m16)) {
        }
        String str22222222222222 = m16;
        if (kVar != null) {
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
        }
        ((NotificationManager) ((FirebaseMessagingService) this.f19195c).getSystemService("notification")).notify(str22222222222222, 0, qVar2222.a());
        return true;
    }

    public void s(int i7) {
        String valueOf;
        wc.c a9 = ((wc.c) this.f19195c).a('\n');
        xc.f fVar = (xc.f) this.f19196d;
        int i10 = i7 * fVar.f26338d;
        int i11 = fVar.f26339e;
        String[] strArr = wc.l.f25891a;
        vc.i.x("width must be >= 0", i10 >= 0);
        vc.i.y(i11 >= -1);
        if (i11 != -1) {
            i10 = Math.min(i10, i11);
        }
        if (i10 < 21) {
            valueOf = wc.l.f25891a[i10];
        } else {
            char[] cArr = new char[i10];
            for (int i12 = 0; i12 < i10; i12++) {
                cArr[i12] = ' ';
            }
            valueOf = String.valueOf(cArr);
        }
        a9.b(valueOf);
    }

    public String toString() {
        switch (this.f19193a) {
            case 5:
                StringBuilder sb2 = new StringBuilder();
                Iterator it = ((ArrayList) this.f19194b).iterator();
                o9.e eVar = null;
                while (it.hasNext()) {
                    o9.e eVar2 = (o9.e) it.next();
                    if (eVar != null) {
                        sb2.append(",");
                    }
                    sb2.append(eVar2.toString());
                    eVar = eVar2;
                }
                return sb2.toString();
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                StringBuilder sb3 = new StringBuilder("NavDeepLinkRequest{");
                Uri uri = (Uri) this.f19194b;
                if (uri != null) {
                    sb3.append(" uri=");
                    sb3.append(String.valueOf(uri));
                }
                String str = (String) this.f19195c;
                if (str != null) {
                    sb3.append(" action=");
                    sb3.append(str);
                }
                String str2 = (String) this.f19196d;
                if (str2 != null) {
                    sb3.append(" mimetype=");
                    sb3.append(str2);
                }
                sb3.append(" }");
                String sb4 = sb3.toString();
                kotlin.jvm.internal.l.d(sb4, "toString(...)");
                return sb4;
            default:
                return super.toString();
        }
    }

    public void v(r rVar) {
        W w10 = (W) this.f19196d;
        if (w10 != null) {
            w10.run();
        }
        W w11 = new W((C1481z) this.f19194b, rVar);
        this.f19196d = w11;
        ((Handler) this.f19195c).postAtFrontOfQueue(w11);
    }

    public void w() {
        ((TypedArray) this.f19195c).recycle();
    }
}
