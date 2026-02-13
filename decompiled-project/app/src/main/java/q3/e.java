package q3;

import A0.J;
import A9.C0131r1;
import A9.F;
import A9.L1;
import A9.t3;
import A9.u3;
import B0.D;
import B0.h1;
import C3.A;
import H2.r0;
import H2.s0;
import I2.AbstractC0315d;
import J3.B;
import J3.C0338b;
import J3.C0340d;
import K0.C0374d;
import K0.E;
import L7.C;
import L7.C0384d;
import L7.C0385e;
import L7.z;
import P4.C0463k;
import Y5.t1;
import Z9.C0668e;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.database.Cursor;
import android.graphics.ImageDecoder;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.format.DateUtils;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.Choreographer;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.widget.ImageView;
import androidx.work.impl.WorkDatabase_Impl;
import com.google.android.datatransport.cct.CctBackendFactory;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
import com.kt.apps.core.base.leanback.BrowseFrameLayout;
import com.kt.apps.core.tv.model.TVChannel;
import com.kt.apps.core.tv.viewmodels.BaseTVChannelViewModel;
import com.kt.apps.core.utils.blurry.BlurFactor;
import com.kt.apps.media.xemtv.beta.R;
import da.C1065c;
import j0.AbstractC1362A;
import java.io.Closeable;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.atomic.AtomicReference;
import jb.InterfaceC1392c;
import jb.InterfaceC1393d;
import jb.InterfaceC1394e;
import l2.H;
import m4.K;
import m4.L;
import n5.AbstractC1705a;
import o7.InterfaceC1811a;
import org.json.JSONObject;
import s4.InterfaceC1984l;
import s4.v;
import t8.C2034c;
import u.C2041D;
import u.N;
import u.T;
import u.X;
import va.C2161e;
import y0.S;

/* loaded from: classes.dex */
public final class e implements L1, F, SuccessContinuation, S, C, InterfaceC1393d, A3.o, InterfaceC1392c, InterfaceC1394e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23375a;

    /* renamed from: b, reason: collision with root package name */
    public Object f23376b;

    /* renamed from: c, reason: collision with root package name */
    public Object f23377c;

    public e(int i7) {
        this.f23375a = i7;
        switch (i7) {
            case BlurFactor.DEFAULT_RADIUS /* 25 */:
                F5.e eVar = F5.e.f4098d;
                this.f23376b = new SparseIntArray();
                this.f23377c = eVar;
                return;
            case 28:
                return;
            default:
                this.f23376b = new AtomicReference();
                this.f23377c = new T(0);
                return;
        }
    }

    public /* synthetic */ e(int i7, Object obj, Object obj2) {
        this.f23375a = i7;
        this.f23376b = obj;
        this.f23377c = obj2;
    }

    public /* synthetic */ e(int i7, Object obj, Object obj2, boolean z8) {
        this.f23375a = i7;
        this.f23377c = obj;
        this.f23376b = obj2;
    }

    public e(F.r rVar) {
        this.f23375a = 7;
        this.f23376b = rVar;
        C2041D c2041d = N.f24629a;
        this.f23377c = new C2041D();
    }

    public e(s0 s0Var) {
        this.f23375a = 8;
        this.f23376b = s0Var;
        r0 r0Var = new r0();
        r0Var.f4793b = 0;
        this.f23377c = r0Var;
    }

    public e(C0384d c0384d) {
        this.f23375a = 18;
        this.f23376b = c0384d.f6330b;
        this.f23377c = c0384d.b("EventRaiser");
    }

    public e(t1 t1Var) {
        this.f23375a = 21;
        Objects.requireNonNull(t1Var);
        this.f23377c = t1Var;
    }

    public e(Animator animator) {
        this.f23375a = 20;
        this.f23376b = null;
        AnimatorSet animatorSet = new AnimatorSet();
        this.f23377c = animatorSet;
        animatorSet.play(animator);
    }

    public e(IBinder iBinder) {
        this.f23375a = 6;
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (Objects.equals(interfaceDescriptor, "android.os.IMessenger")) {
            this.f23376b = new Messenger(iBinder);
            this.f23377c = null;
        } else {
            if (!Objects.equals(interfaceDescriptor, "com.google.android.gms.iid.IMessengerCompat")) {
                Log.w("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
                throw new RemoteException();
            }
            this.f23377c = new E5.g(iBinder);
            this.f23376b = null;
        }
    }

    public e(View view, D d10) {
        this.f23375a = 16;
        new c(view);
        Choreographer.getInstance();
        this.f23376b = view;
        new O0.c(new C0374d(""), E.f5851b);
        int i7 = O0.b.f7409e;
        new ArrayList();
        this.f23377c = android.support.v4.media.session.b.y(Db.h.f3352a, new J(this, 9));
        new CursorAnchorInfo.Builder();
        AbstractC1362A.g();
        new Matrix();
    }

    public e(WorkDatabase_Impl workDatabase_Impl) {
        this.f23375a = 0;
        this.f23376b = workDatabase_Impl;
        this.f23377c = new b(workDatabase_Impl, 1);
    }

    public /* synthetic */ e(Object obj, int i7) {
        this.f23375a = i7;
        this.f23376b = obj;
        this.f23377c = null;
    }

    public e(List list) {
        this.f23375a = 4;
        this.f23376b = list;
        this.f23377c = new v[list.size()];
    }

    public e(p7.n nVar) {
        this.f23375a = 9;
        this.f23376b = nVar;
        this.f23377c = new AtomicReference();
        nVar.a(new A1.d(this, 19));
    }

    public static String a(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ".concat(cls.getName());
        }
        if (!Modifier.isAbstract(modifiers)) {
            return null;
        }
        return "Abstract classes can't be instantiated! Adjust the R8 configuration or register an InstanceCreator or a TypeAdapter for this type. Class name: " + cls.getName() + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("r8-abstract-class");
    }

    public static B i(ImageDecoder.Source source, int i7, int i10, A3.l lVar) {
        Drawable decodeDrawable;
        decodeDrawable = ImageDecoder.decodeDrawable(source, new I3.b(i7, i10, lVar));
        if (h1.w(decodeDrawable)) {
            return new B(h1.i(decodeDrawable), 2);
        }
        throw new IOException("Received unexpected drawable type for animated image, failing: " + decodeDrawable);
    }

    @Override // jb.InterfaceC1393d
    public void accept(Object obj) {
        switch (this.f23375a) {
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                Throwable it = (Throwable) obj;
                kotlin.jvm.internal.l.e(it, "it");
                ((H) this.f23376b).l(new y9.D(it));
                C2161e t5 = (C2161e) this.f23377c;
                kotlin.jvm.internal.l.e(t5, "t");
                return;
            default:
                kotlin.jvm.internal.l.e((Throwable) obj, "it");
                Map map = (Map) ((P9.c) this.f23376b).f8258d.getValue();
                W9.c cVar = (W9.c) this.f23377c;
                map.remove(cVar.f10858a);
                String.valueOf(cVar);
                return;
        }
    }

    @Override // jb.InterfaceC1394e
    public Object apply(Object obj) {
        N9.a aVar;
        Iterator it;
        switch (this.f23375a) {
            case 22:
                Boolean needRefresh = (Boolean) obj;
                kotlin.jvm.internal.l.e(needRefresh, "needRefresh");
                boolean booleanValue = needRefresh.booleanValue();
                tb.e eVar = (tb.e) this.f23377c;
                Z9.s sVar = (Z9.s) this.f23376b;
                return booleanValue ? new tb.e(new tb.e(Z9.s.c(sVar), C0668e.f12263d, 1), new C0463k(eVar, 17), 2).g() : new tb.e(eVar, new R7.a(sVar, 18), 2).g();
            case 26:
                Throwable it2 = (Throwable) obj;
                kotlin.jvm.internal.l.e(it2, "it");
                C1065c c1065c = (C1065c) this.f23376b;
                c1065c.f16614f.set(false);
                Object obj2 = ((Map) this.f23377c).get("extra:refresh_data");
                kotlin.jvm.internal.l.c(obj2, "null cannot be cast to non-null type kotlin.Boolean");
                return C1065c.b(c1065c, ((Boolean) obj2).booleanValue(), 2);
            default:
                List<N9.a> oldProgramList = (List) obj;
                kotlin.jvm.internal.l.e(oldProgramList, "oldProgramList");
                if (oldProgramList.isEmpty()) {
                    return oldProgramList;
                }
                BaseTVChannelViewModel baseTVChannelViewModel = (BaseTVChannelViewModel) this.f23376b;
                TVChannel tVChannel = (TVChannel) this.f23377c;
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : oldProgramList) {
                    N9.a aVar2 = (N9.a) obj3;
                    if (kotlin.jvm.internal.l.a(baseTVChannelViewModel.remoAllSpecialCharsAndPrefix(aVar2.f7389a), tVChannel.getChannelIdWithoutSpecialChars()) && DateUtils.isToday(aVar2.d())) {
                        arrayList.add(obj3);
                    }
                }
                ArrayList u02 = Eb.o.u0(arrayList);
                try {
                    it = u02.iterator();
                } catch (Exception unused) {
                    aVar = null;
                }
                while (it.hasNext()) {
                    Object next = it.next();
                    if (((N9.a) next).c()) {
                        aVar = (N9.a) next;
                        synchronized (u02) {
                            try {
                                for (N9.a aVar3 : oldProgramList) {
                                    if (aVar3.c()) {
                                        if (kotlin.jvm.internal.l.a(aVar3.f7391c, aVar != null ? aVar.f7391c : null) && kotlin.jvm.internal.l.a(aVar3.f7393e, aVar.f7393e)) {
                                        }
                                        u02.remove(aVar3);
                                    }
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return u02;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
    }

    @Override // A9.F
    public boolean b(int i7, Rect rect) {
        if (i7 != 130) {
            return false;
        }
        Ba.s sVar = (Ba.s) this.f23376b;
        if (sVar.f751n0.getChildCount() != 0) {
            return false;
        }
        ImageView imageView = sVar.f2286a1;
        if (imageView == null || imageView.getVisibility() != 0) {
            ImageView imageView2 = (ImageView) ((BrowseFrameLayout) this.f23377c).findViewById(R.id.search_voice_btn);
            if (imageView2 == null) {
                return true;
            }
            imageView2.requestFocus();
            return true;
        }
        ImageView imageView3 = sVar.f2286a1;
        if (imageView3 == null) {
            return true;
        }
        imageView3.requestFocus();
        return true;
    }

    @Override // A3.d
    public boolean c(Object obj, File file, A3.l lVar) {
        return ((C0338b) this.f23377c).c(new C0340d((D3.a) this.f23376b, ((BitmapDrawable) ((A) obj).get()).getBitmap()), file, lVar);
    }

    @Override // L7.C
    public void d(boolean z8, l lVar) {
        InterfaceC1811a interfaceC1811a = (InterfaceC1811a) ((AtomicReference) this.f23377c).get();
        if (interfaceC1811a != null) {
            ((FirebaseAuth) interfaceC1811a).a(z8).addOnSuccessListener(new H7.c(lVar, 2)).addOnFailureListener(new H7.c(lVar, 3));
        } else {
            lVar.E(null);
        }
    }

    @Override // A9.F
    public void e(View view) {
    }

    @Override // y0.S
    public void f(X x2) {
        C2041D c2041d = (C2041D) this.f23377c;
        c2041d.a();
        Iterator it = x2.iterator();
        while (true) {
            W.c cVar = (W.c) it;
            if (!cVar.hasNext()) {
                return;
            }
            Object next = cVar.next();
            Object b2 = ((F.r) this.f23376b).b(next);
            int d10 = c2041d.d(b2);
            int i7 = d10 >= 0 ? c2041d.f24580c[d10] : 0;
            if (i7 == 7) {
                x2.remove(next);
            } else {
                c2041d.g(i7 + 1, b2);
            }
        }
    }

    @Override // y0.S
    public boolean g(Object obj, Object obj2) {
        F.r rVar = (F.r) this.f23376b;
        return kotlin.jvm.internal.l.a(rVar.b(obj), rVar.b(obj2));
    }

    public void h(InterfaceC1984l interfaceC1984l, C4.F f4) {
        int i7 = 0;
        while (true) {
            v[] vVarArr = (v[]) this.f23377c;
            if (i7 >= vVarArr.length) {
                return;
            }
            f4.a();
            f4.b();
            v u3 = interfaceC1984l.u(f4.f2683d, 3);
            L l10 = (L) ((List) this.f23376b).get(i7);
            String str = l10.f20096z;
            AbstractC1705a.g("Invalid closed caption MIME type provided: " + str, "application/cea-608".equals(str) || "application/cea-708".equals(str));
            String str2 = l10.f20085a;
            if (str2 == null) {
                f4.b();
                str2 = f4.f2684e;
            }
            K k = new K();
            k.f19976a = str2;
            k.k = str;
            k.f19979d = l10.f20088d;
            k.f19978c = l10.f20087c;
            k.f19972C = l10.f20080R;
            k.f19985m = l10.f20065B;
            h3.o.w(k, u3);
            vVarArr[i7] = u3;
            i7++;
        }
    }

    @Override // A9.L1
    public void j(View view, int i7) {
        u3 u3Var = (u3) this.f23377c;
        if (u3Var.f1416e != null) {
            C0131r1 c0131r1 = view == null ? null : (C0131r1) ((t3) this.f23376b).f1376c.L(view);
            if (c0131r1 == null) {
                u3Var.f1416e.a(null, null, null, null);
            } else {
                u3Var.f1416e.a(c0131r1.f1355v, c0131r1.f1356w, null, null);
            }
        }
    }

    public View k(int i7, int i10, int i11, int i12) {
        s0 s0Var = (s0) this.f23376b;
        int p10 = s0Var.p();
        int g = s0Var.g();
        int i13 = i10 > i7 ? 1 : -1;
        View view = null;
        while (i7 != i10) {
            View o10 = s0Var.o(i7);
            int j = s0Var.j(o10);
            int r10 = s0Var.r(o10);
            r0 r0Var = (r0) this.f23377c;
            r0Var.f4794c = p10;
            r0Var.f4795d = g;
            r0Var.f4796e = j;
            r0Var.f4797f = r10;
            if (i11 != 0) {
                r0Var.f4793b = i11;
                if (r0Var.a()) {
                    return o10;
                }
            }
            if (i12 != 0) {
                r0Var.f4793b = i12;
                if (r0Var.a()) {
                    view = o10;
                }
            }
            i7 += i13;
        }
        return view;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ff, code lost:
    
        if (I8.h.h(r2[0]) != java.lang.String.class) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public I8.o l(N8.a aVar, boolean z8) {
        final String str;
        I8.o dVar;
        int i7 = 21;
        int i10 = 20;
        final int i11 = 1;
        final int i12 = 0;
        Map map = (Map) this.f23376b;
        final Type type = aVar.f7387b;
        if (map.get(type) != null) {
            throw new ClassCastException();
        }
        Class cls = aVar.f7386a;
        if (map.get(cls) != null) {
            throw new ClassCastException();
        }
        A4.p pVar = null;
        I8.o oVar = EnumSet.class.isAssignableFrom(cls) ? new I8.o() { // from class: I8.b
            @Override // I8.o
            public final Object h() {
                switch (i12) {
                    case 0:
                        Type type2 = type;
                        if (!(type2 instanceof ParameterizedType)) {
                            throw new Db.d("Invalid EnumSet type: " + type2.toString(), 4);
                        }
                        Type type3 = ((ParameterizedType) type2).getActualTypeArguments()[0];
                        if (type3 instanceof Class) {
                            return EnumSet.noneOf((Class) type3);
                        }
                        throw new Db.d("Invalid EnumSet type: " + type2.toString(), 4);
                    default:
                        Type type4 = type;
                        if (!(type4 instanceof ParameterizedType)) {
                            throw new Db.d("Invalid EnumMap type: " + type4.toString(), 4);
                        }
                        Type type5 = ((ParameterizedType) type4).getActualTypeArguments()[0];
                        if (type5 instanceof Class) {
                            return new EnumMap((Class) type5);
                        }
                        throw new Db.d("Invalid EnumMap type: " + type4.toString(), 4);
                }
            }
        } : cls == EnumMap.class ? new I8.o() { // from class: I8.b
            @Override // I8.o
            public final Object h() {
                switch (i11) {
                    case 0:
                        Type type2 = type;
                        if (!(type2 instanceof ParameterizedType)) {
                            throw new Db.d("Invalid EnumSet type: " + type2.toString(), 4);
                        }
                        Type type3 = ((ParameterizedType) type2).getActualTypeArguments()[0];
                        if (type3 instanceof Class) {
                            return EnumSet.noneOf((Class) type3);
                        }
                        throw new Db.d("Invalid EnumSet type: " + type2.toString(), 4);
                    default:
                        Type type4 = type;
                        if (!(type4 instanceof ParameterizedType)) {
                            throw new Db.d("Invalid EnumMap type: " + type4.toString(), 4);
                        }
                        Type type5 = ((ParameterizedType) type4).getActualTypeArguments()[0];
                        if (type5 instanceof Class) {
                            return new EnumMap((Class) type5);
                        }
                        throw new Db.d("Invalid EnumMap type: " + type4.toString(), 4);
                }
            }
        } : null;
        if (oVar != null) {
            return oVar;
        }
        I8.h.f((List) this.f23377c);
        if (!Modifier.isAbstract(cls.getModifiers())) {
            try {
                Constructor declaredConstructor = cls.getDeclaredConstructor(null);
                com.bumptech.glide.d dVar2 = L8.c.f6421a;
                try {
                    declaredConstructor.setAccessible(true);
                    str = null;
                } catch (Exception e2) {
                    str = "Failed making constructor '" + L8.c.b(declaredConstructor) + "' accessible; either increase its visibility or write a custom InstanceCreator or TypeAdapter for its declaring type: " + e2.getMessage() + L8.c.e(e2);
                }
                dVar = str != null ? new I8.o() { // from class: I8.a
                    @Override // I8.o
                    public final Object h() {
                        switch (i11) {
                            case 0:
                                throw new Db.d(str, 4);
                            case 1:
                                throw new Db.d(str, 4);
                            default:
                                throw new Db.d(str, 4);
                        }
                    }
                } : new A1.d(declaredConstructor, i10);
            } catch (NoSuchMethodException unused) {
            }
            if (dVar == null) {
                return dVar;
            }
            if (Collection.class.isAssignableFrom(cls)) {
                if (cls.isAssignableFrom(ArrayList.class)) {
                    pVar = new A4.p(22);
                } else if (cls.isAssignableFrom(LinkedHashSet.class)) {
                    pVar = new A4.p(23);
                } else if (cls.isAssignableFrom(TreeSet.class)) {
                    pVar = new A4.p(24);
                } else if (cls.isAssignableFrom(ArrayDeque.class)) {
                    pVar = new A4.p(25);
                }
            } else if (Map.class.isAssignableFrom(cls)) {
                if (cls.isAssignableFrom(I8.n.class)) {
                    if (type instanceof ParameterizedType) {
                        Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
                        if (actualTypeArguments.length != 0) {
                        }
                    }
                    pVar = new A4.p(26);
                }
                if (cls.isAssignableFrom(LinkedHashMap.class)) {
                    pVar = new A4.p(18);
                } else if (cls.isAssignableFrom(TreeMap.class)) {
                    pVar = new A4.p(19);
                } else if (cls.isAssignableFrom(ConcurrentHashMap.class)) {
                    pVar = new A4.p(i10);
                } else if (cls.isAssignableFrom(ConcurrentSkipListMap.class)) {
                    pVar = new A4.p(i7);
                }
            }
            if (pVar != null) {
                return pVar;
            }
            final String a9 = a(cls);
            if (a9 != null) {
                return new I8.o() { // from class: I8.a
                    @Override // I8.o
                    public final Object h() {
                        switch (i12) {
                            case 0:
                                throw new Db.d(a9, 4);
                            case 1:
                                throw new Db.d(a9, 4);
                            default:
                                throw new Db.d(a9, 4);
                        }
                    }
                };
            }
            if (z8) {
                return new A1.d(cls, i7);
            }
            final String str2 = "Unable to create instance of " + cls + "; Register an InstanceCreator or a TypeAdapter for this type.";
            final int i13 = 2;
            return new I8.o() { // from class: I8.a
                @Override // I8.o
                public final Object h() {
                    switch (i13) {
                        case 0:
                            throw new Db.d(str2, 4);
                        case 1:
                            throw new Db.d(str2, 4);
                        default:
                            throw new Db.d(str2, 4);
                    }
                }
            };
        }
        dVar = null;
        if (dVar == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CctBackendFactory m(String str) {
        Bundle bundle;
        Map map;
        PackageManager packageManager;
        if (((Map) this.f23377c) == null) {
            Context context = (Context) this.f23376b;
            try {
                packageManager = context.getPackageManager();
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("BackendRegistry", "Application info not found.");
            }
            if (packageManager == null) {
                Log.w("BackendRegistry", "Context has no PackageManager.");
            } else {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), 128);
                if (serviceInfo == null) {
                    Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                } else {
                    bundle = serviceInfo.metaData;
                    if (bundle != null) {
                        Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                        map = Collections.emptyMap();
                    } else {
                        HashMap hashMap = new HashMap();
                        for (String str2 : bundle.keySet()) {
                            Object obj = bundle.get(str2);
                            if ((obj instanceof String) && str2.startsWith("backend:")) {
                                for (String str3 : ((String) obj).split(",", -1)) {
                                    String trim = str3.trim();
                                    if (!trim.isEmpty()) {
                                        hashMap.put(trim, str2.substring(8));
                                    }
                                }
                            }
                        }
                        map = hashMap;
                    }
                    this.f23377c = map;
                }
            }
            bundle = null;
            if (bundle != null) {
            }
            this.f23377c = map;
        }
        String str4 = (String) ((Map) this.f23377c).get(str);
        if (str4 == null) {
            return null;
        }
        try {
            return (CctBackendFactory) Class.forName(str4).asSubclass(CctBackendFactory.class).getDeclaredConstructor(null).newInstance(null);
        } catch (ClassNotFoundException e2) {
            Log.w("BackendRegistry", "Class " + str4 + " is not found.", e2);
            return null;
        } catch (IllegalAccessException e10) {
            Log.w("BackendRegistry", "Could not instantiate " + str4 + ".", e10);
            return null;
        } catch (InstantiationException e11) {
            Log.w("BackendRegistry", "Could not instantiate " + str4 + ".", e11);
            return null;
        } catch (NoSuchMethodException e12) {
            Log.w("BackendRegistry", "Could not instantiate ".concat(str4), e12);
            return null;
        } catch (InvocationTargetException e13) {
            Log.w("BackendRegistry", "Could not instantiate ".concat(str4), e13);
            return null;
        }
    }

    public e n(T7.c cVar) {
        return new e(14, (z) this.f23376b, ((C0385e) this.f23377c).o(cVar));
    }

    public Long o(String str) {
        TreeMap treeMap = I2.H.f5039w;
        I2.H a9 = AbstractC0315d.a(1, "SELECT long_value FROM Preference where `key`=?");
        a9.p(1, str);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f23376b;
        workDatabase_Impl.b();
        Cursor n6 = P2.j.n(workDatabase_Impl, a9);
        try {
            Long l10 = null;
            if (n6.moveToFirst() && !n6.isNull(0)) {
                l10 = Long.valueOf(n6.getLong(0));
            }
            return l10;
        } finally {
            n6.close();
            a9.F();
        }
    }

    public void p(d dVar) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f23376b;
        workDatabase_Impl.b();
        workDatabase_Impl.c();
        try {
            ((b) this.f23377c).o(dVar);
            workDatabase_Impl.v();
        } finally {
            workDatabase_Impl.r();
        }
    }

    @Override // A3.o
    public int q(A3.l lVar) {
        return 2;
    }

    public boolean r(View view) {
        s0 s0Var = (s0) this.f23376b;
        int p10 = s0Var.p();
        int g = s0Var.g();
        int j = s0Var.j(view);
        int r10 = s0Var.r(view);
        r0 r0Var = (r0) this.f23377c;
        r0Var.f4794c = p10;
        r0Var.f4795d = g;
        r0Var.f4796e = j;
        r0Var.f4797f = r10;
        r0Var.f4793b = 24579;
        return r0Var.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v8, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r2v1, types: [t8.c] */
    /* JADX WARN: Type inference failed for: r3v0, types: [long] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.io.Closeable] */
    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        FileWriter fileWriter;
        ?? r10 = (JSONObject) ((w7.d) this.f23376b).f25821c.f25815a.submit(new D7.c(this, 0)).get();
        Closeable closeable = null;
        if (r10 != 0) {
            D7.d dVar = (D7.d) this.f23377c;
            D7.b k = ((C2034c) dVar.f3271c).k(r10);
            ?? r32 = k.f3263c;
            D5.i iVar = (D5.i) dVar.f3273e;
            iVar.getClass();
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Writing settings to cache file...", null);
            }
            try {
                try {
                    try {
                        r10.put("expires_at", r32);
                        try {
                            fileWriter = new FileWriter((File) iVar.f3256b);
                        } catch (Exception e2) {
                            e = e2;
                            fileWriter = null;
                            Log.e("FirebaseCrashlytics", "Failed to cache settings", e);
                            r32 = fileWriter;
                            v7.g.b(r32, "Failed to close settings writer.");
                            D7.d.c(r10, "Loaded settings: ");
                            String str = ((D7.f) dVar.f3270b).f3282f;
                            SharedPreferences.Editor edit = ((Context) dVar.f3269a).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
                            edit.putString("existing_instance_identifier", str);
                            edit.apply();
                            ((AtomicReference) dVar.f3275h).set(k);
                            ((TaskCompletionSource) ((AtomicReference) dVar.f3276i).get()).trySetResult(k);
                            return Tasks.forResult(null);
                        }
                    } catch (Throwable th) {
                        th = th;
                        v7.g.b(closeable, "Failed to close settings writer.");
                        throw th;
                    }
                } catch (Exception e10) {
                    e = e10;
                }
                try {
                    fileWriter.write(r10.toString());
                    fileWriter.flush();
                    r32 = fileWriter;
                } catch (Exception e11) {
                    e = e11;
                    Log.e("FirebaseCrashlytics", "Failed to cache settings", e);
                    r32 = fileWriter;
                    v7.g.b(r32, "Failed to close settings writer.");
                    D7.d.c(r10, "Loaded settings: ");
                    String str2 = ((D7.f) dVar.f3270b).f3282f;
                    SharedPreferences.Editor edit2 = ((Context) dVar.f3269a).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
                    edit2.putString("existing_instance_identifier", str2);
                    edit2.apply();
                    ((AtomicReference) dVar.f3275h).set(k);
                    ((TaskCompletionSource) ((AtomicReference) dVar.f3276i).get()).trySetResult(k);
                    return Tasks.forResult(null);
                }
                v7.g.b(r32, "Failed to close settings writer.");
                D7.d.c(r10, "Loaded settings: ");
                String str22 = ((D7.f) dVar.f3270b).f3282f;
                SharedPreferences.Editor edit22 = ((Context) dVar.f3269a).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
                edit22.putString("existing_instance_identifier", str22);
                edit22.apply();
                ((AtomicReference) dVar.f3275h).set(k);
                ((TaskCompletionSource) ((AtomicReference) dVar.f3276i).get()).trySetResult(k);
            } catch (Throwable th2) {
                th = th2;
                closeable = r32;
                v7.g.b(closeable, "Failed to close settings writer.");
                throw th;
            }
        }
        return Tasks.forResult(null);
    }

    public String toString() {
        switch (this.f23375a) {
            case 10:
                return ((Map) this.f23376b).toString();
            default:
                return super.toString();
        }
    }

    @Override // jb.InterfaceC1392c
    public boolean w(Integer num, Throwable throwable) {
        kotlin.jvm.internal.l.e(throwable, "throwable");
        String message = "retry - " + ((String) this.f23377c);
        M9.k t5 = (M9.k) this.f23376b;
        kotlin.jvm.internal.l.e(t5, "t");
        kotlin.jvm.internal.l.e(message, "message");
        return num.intValue() < 3 && !(throwable instanceof M9.f);
    }
}
