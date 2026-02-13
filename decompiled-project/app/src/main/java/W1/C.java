package W1;

import A9.N2;
import A9.S2;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import ea.C1112g;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import l1.AbstractC1449a;
import l2.AbstractC1456G;
import l2.C1481z;
import l2.EnumC1474s;
import l2.InterfaceC1470n;
import l2.InterfaceC1479x;

/* loaded from: classes.dex */
public abstract class C implements ComponentCallbacks, View.OnCreateContextMenuListener, InterfaceC1479x, l2.e0, InterfaceC1470n, Q2.e {

    /* renamed from: l0, reason: collision with root package name */
    public static final Object f10257l0 = new Object();

    /* renamed from: A, reason: collision with root package name */
    public boolean f10258A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f10259B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f10260C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f10261D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f10262E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f10263F;

    /* renamed from: G, reason: collision with root package name */
    public int f10264G;

    /* renamed from: H, reason: collision with root package name */
    public U f10265H;

    /* renamed from: I, reason: collision with root package name */
    public F f10266I;

    /* renamed from: J, reason: collision with root package name */
    public U f10267J;

    /* renamed from: K, reason: collision with root package name */
    public C f10268K;
    public int L;

    /* renamed from: M, reason: collision with root package name */
    public int f10269M;

    /* renamed from: N, reason: collision with root package name */
    public String f10270N;

    /* renamed from: O, reason: collision with root package name */
    public boolean f10271O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f10272P;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f10273Q;

    /* renamed from: R, reason: collision with root package name */
    public boolean f10274R;

    /* renamed from: S, reason: collision with root package name */
    public boolean f10275S;

    /* renamed from: T, reason: collision with root package name */
    public ViewGroup f10276T;

    /* renamed from: U, reason: collision with root package name */
    public View f10277U;

    /* renamed from: V, reason: collision with root package name */
    public boolean f10278V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f10279W;

    /* renamed from: X, reason: collision with root package name */
    public C0582z f10280X;

    /* renamed from: Y, reason: collision with root package name */
    public boolean f10281Y;

    /* renamed from: Z, reason: collision with root package name */
    public boolean f10282Z;

    /* renamed from: a, reason: collision with root package name */
    public int f10283a;

    /* renamed from: a0, reason: collision with root package name */
    public String f10284a0;

    /* renamed from: b, reason: collision with root package name */
    public Bundle f10285b;

    /* renamed from: b0, reason: collision with root package name */
    public EnumC1474s f10286b0;

    /* renamed from: c, reason: collision with root package name */
    public SparseArray f10287c;

    /* renamed from: c0, reason: collision with root package name */
    public C1481z f10288c0;

    /* renamed from: d, reason: collision with root package name */
    public Bundle f10289d;

    /* renamed from: d0, reason: collision with root package name */
    public l0 f10290d0;

    /* renamed from: e, reason: collision with root package name */
    public Boolean f10291e;

    /* renamed from: e0, reason: collision with root package name */
    public final l2.H f10292e0;

    /* renamed from: f, reason: collision with root package name */
    public String f10293f;

    /* renamed from: f0, reason: collision with root package name */
    public l2.U f10294f0;

    /* renamed from: g0, reason: collision with root package name */
    public q3.c f10295g0;

    /* renamed from: h0, reason: collision with root package name */
    public final int f10296h0;

    /* renamed from: i0, reason: collision with root package name */
    public final AtomicInteger f10297i0;

    /* renamed from: j0, reason: collision with root package name */
    public final ArrayList f10298j0;

    /* renamed from: k0, reason: collision with root package name */
    public final C0579w f10299k0;

    /* renamed from: u, reason: collision with root package name */
    public Bundle f10300u;

    /* renamed from: v, reason: collision with root package name */
    public C f10301v;

    /* renamed from: w, reason: collision with root package name */
    public String f10302w;

    /* renamed from: x, reason: collision with root package name */
    public int f10303x;

    /* renamed from: y, reason: collision with root package name */
    public Boolean f10304y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f10305z;

    /* JADX WARN: Type inference failed for: r0v8, types: [l2.H, l2.G] */
    public C() {
        this.f10283a = -1;
        this.f10293f = UUID.randomUUID().toString();
        this.f10302w = null;
        this.f10304y = null;
        this.f10267J = new U();
        this.f10274R = true;
        this.f10279W = true;
        new B0.C(this, 14);
        this.f10286b0 = EnumC1474s.f19231e;
        this.f10292e0 = new AbstractC1456G();
        this.f10297i0 = new AtomicInteger();
        this.f10298j0 = new ArrayList();
        this.f10299k0 = new C0579w(this);
        I();
    }

    public C(int i7) {
        this();
        this.f10296h0 = i7;
    }

    public final G A() {
        F f4 = this.f10266I;
        if (f4 == null) {
            return null;
        }
        return f4.f10310a;
    }

    public final U B() {
        if (this.f10266I != null) {
            return this.f10267J;
        }
        throw new IllegalStateException(A3.c.i("Fragment ", this, " has not been attached yet."));
    }

    public Context C() {
        F f4 = this.f10266I;
        if (f4 == null) {
            return null;
        }
        return f4.f10311b;
    }

    public final int D() {
        EnumC1474s enumC1474s = this.f10286b0;
        return (enumC1474s == EnumC1474s.f19228b || this.f10268K == null) ? enumC1474s.ordinal() : Math.min(enumC1474s.ordinal(), this.f10268K.D());
    }

    public final U E() {
        U u3 = this.f10265H;
        if (u3 != null) {
            return u3;
        }
        throw new IllegalStateException(A3.c.i("Fragment ", this, " not associated with a fragment manager."));
    }

    public final Resources F() {
        return i0().getResources();
    }

    public final String G(int i7) {
        return F().getString(i7);
    }

    public final l0 H() {
        l0 l0Var = this.f10290d0;
        if (l0Var != null) {
            return l0Var;
        }
        throw new IllegalStateException(A3.c.i("Can't access the Fragment View's LifecycleOwner for ", this, " when getView() is null i.e., before onCreateView() or after onDestroyView()"));
    }

    public final void I() {
        this.f10288c0 = new C1481z(this);
        this.f10295g0 = new q3.c(new S2.b(this, new N2(this, 15)));
        this.f10294f0 = null;
        ArrayList arrayList = this.f10298j0;
        C0579w c0579w = this.f10299k0;
        if (arrayList.contains(c0579w)) {
            return;
        }
        if (this.f10283a >= 0) {
            c0579w.a();
        } else {
            arrayList.add(c0579w);
        }
    }

    public final void J() {
        I();
        this.f10284a0 = this.f10293f;
        this.f10293f = UUID.randomUUID().toString();
        this.f10305z = false;
        this.f10258A = false;
        this.f10260C = false;
        this.f10261D = false;
        this.f10262E = false;
        this.f10264G = 0;
        this.f10265H = null;
        this.f10267J = new U();
        this.f10266I = null;
        this.L = 0;
        this.f10269M = 0;
        this.f10270N = null;
        this.f10271O = false;
        this.f10272P = false;
    }

    public final boolean K() {
        return this.f10266I != null && this.f10305z;
    }

    public final boolean L() {
        if (!this.f10271O) {
            U u3 = this.f10265H;
            if (u3 == null) {
                return false;
            }
            C c10 = this.f10268K;
            u3.getClass();
            if (!(c10 == null ? false : c10.L())) {
                return false;
            }
        }
        return true;
    }

    public final boolean M() {
        return this.f10264G > 0;
    }

    public final boolean N() {
        View view;
        return (!K() || L() || (view = this.f10277U) == null || view.getWindowToken() == null || this.f10277U.getVisibility() != 0) ? false : true;
    }

    public void O() {
        this.f10275S = true;
    }

    public void P(int i7, int i10, Intent intent) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i7 + " resultCode: " + i10 + " data: " + intent);
        }
    }

    public void Q(Activity activity) {
        this.f10275S = true;
    }

    public void R(Context context) {
        this.f10275S = true;
        F f4 = this.f10266I;
        G g = f4 == null ? null : f4.f10310a;
        if (g != null) {
            this.f10275S = false;
            Q(g);
        }
    }

    public void S(Bundle bundle) {
        Bundle bundle2;
        this.f10275S = true;
        Bundle bundle3 = this.f10285b;
        if (bundle3 != null && (bundle2 = bundle3.getBundle("childFragmentManager")) != null) {
            this.f10267J.X(bundle2);
            U u3 = this.f10267J;
            u3.f10347H = false;
            u3.f10348I = false;
            u3.f10353O.f10392f = false;
            u3.u(1);
        }
        U u10 = this.f10267J;
        if (u10.f10373v >= 1) {
            return;
        }
        u10.f10347H = false;
        u10.f10348I = false;
        u10.f10353O.f10392f = false;
        u10.u(1);
    }

    public View T(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i7 = this.f10296h0;
        if (i7 != 0) {
            return layoutInflater.inflate(i7, viewGroup, false);
        }
        return null;
    }

    public void U() {
        this.f10275S = true;
    }

    public void V() {
        this.f10275S = true;
    }

    public void W() {
        this.f10275S = true;
    }

    public LayoutInflater X(Bundle bundle) {
        F f4 = this.f10266I;
        if (f4 == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        G g = f4.f10314e;
        LayoutInflater cloneInContext = g.getLayoutInflater().cloneInContext(g);
        cloneInContext.setFactory2(this.f10267J.f10360f);
        return cloneInContext;
    }

    public void Y() {
        this.f10275S = true;
    }

    public void Z() {
        this.f10275S = true;
    }

    public void a0(Bundle bundle) {
    }

    @Override // Q2.e
    public final q3.s b() {
        return (q3.s) this.f10295g0.f23372c;
    }

    public void b0() {
        this.f10275S = true;
    }

    public void c0() {
        this.f10275S = true;
    }

    public void d0(View view, Bundle bundle) {
    }

    public void e0(Bundle bundle) {
        this.f10275S = true;
    }

    public void f0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f10267J.R();
        this.f10263F = true;
        this.f10290d0 = new l0(this, s(), new S2(this, 16));
        View T10 = T(layoutInflater, viewGroup, bundle);
        this.f10277U = T10;
        if (T10 == null) {
            if (this.f10290d0.f10506e != null) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.f10290d0 = null;
            return;
        }
        this.f10290d0.d();
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "Setting ViewLifecycleOwner on View " + this.f10277U + " for Fragment " + this);
        }
        l2.Q.i(this.f10277U, this.f10290d0);
        l2.Q.j(this.f10277U, this.f10290d0);
        android.support.v4.media.session.b.C(this.f10277U, this.f10290d0);
        this.f10292e0.k(this.f10290d0);
    }

    public final G g0() {
        G A10 = A();
        if (A10 != null) {
            return A10;
        }
        throw new IllegalStateException(A3.c.i("Fragment ", this, " not attached to an activity."));
    }

    public final Bundle h0() {
        Bundle bundle = this.f10300u;
        if (bundle != null) {
            return bundle;
        }
        throw new IllegalStateException(A3.c.i("Fragment ", this, " does not have any arguments."));
    }

    public final Context i0() {
        Context C2 = C();
        if (C2 != null) {
            return C2;
        }
        throw new IllegalStateException(A3.c.i("Fragment ", this, " not attached to a context."));
    }

    public final View j0() {
        View view = this.f10277U;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException(A3.c.i("Fragment ", this, " did not return a View from onCreateView() or this was called before onCreateView()."));
    }

    public final void k0(int i7, int i10, int i11, int i12) {
        if (this.f10280X == null && i7 == 0 && i10 == 0 && i11 == 0 && i12 == 0) {
            return;
        }
        z().f10577b = i7;
        z().f10578c = i10;
        z().f10579d = i11;
        z().f10580e = i12;
    }

    public final void l0(Bundle bundle) {
        U u3 = this.f10265H;
        if (u3 != null && (u3.f10347H || u3.f10348I)) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.f10300u = bundle;
    }

    public final void m0(boolean z8) {
        X1.c cVar = X1.d.f10910a;
        X1.d.b(new X1.a(this, "Attempting to set user visible hint to " + z8 + " for fragment " + this));
        X1.d.a(this).getClass();
        boolean z10 = false;
        if (!this.f10279W && z8 && this.f10283a < 5 && this.f10265H != null && K() && this.f10282Z) {
            U u3 = this.f10265H;
            a0 g = u3.g(this);
            C c10 = g.f10427c;
            if (c10.f10278V) {
                if (u3.f10356b) {
                    u3.f10350K = true;
                } else {
                    c10.f10278V = false;
                    g.k();
                }
            }
        }
        this.f10279W = z8;
        if (this.f10283a < 5 && !z8) {
            z10 = true;
        }
        this.f10278V = z10;
        if (this.f10285b != null) {
            this.f10291e = Boolean.valueOf(z8);
        }
    }

    public l2.a0 n() {
        Application application;
        if (this.f10265H == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (this.f10294f0 == null) {
            Context applicationContext = i0().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            if (application == null && Log.isLoggable("FragmentManager", 3)) {
                Log.d("FragmentManager", "Could not find Application instance from Context " + i0().getApplicationContext() + ", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory");
            }
            this.f10294f0 = new l2.U(application, this, this.f10300u);
        }
        return this.f10294f0;
    }

    public final void n0(Intent intent) {
        F f4 = this.f10266I;
        if (f4 == null) {
            throw new IllegalStateException(A3.c.i("Fragment ", this, " not attached to Activity"));
        }
        AbstractC1449a.startActivity(f4.f10311b, intent, null);
    }

    @Override // l2.InterfaceC1470n
    public final o2.d o() {
        Application application;
        Context applicationContext = i0().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        if (application == null && Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + i0().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        o2.d dVar = new o2.d(0);
        LinkedHashMap linkedHashMap = dVar.f21663a;
        if (application != null) {
            linkedHashMap.put(l2.Z.f19198d, application);
        }
        linkedHashMap.put(l2.Q.f19174a, this);
        linkedHashMap.put(l2.Q.f19175b, this);
        Bundle bundle = this.f10300u;
        if (bundle != null) {
            linkedHashMap.put(l2.Q.f19176c, bundle);
        }
        return dVar;
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.f10275S = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        g0().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.f10275S = true;
    }

    @Override // l2.e0
    public final l2.d0 s() {
        if (this.f10265H == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        int D10 = D();
        EnumC1474s enumC1474s = EnumC1474s.f19227a;
        if (D10 == 1) {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        HashMap hashMap = this.f10265H.f10353O.f10389c;
        l2.d0 d0Var = (l2.d0) hashMap.get(this.f10293f);
        if (d0Var != null) {
            return d0Var;
        }
        l2.d0 d0Var2 = new l2.d0();
        hashMap.put(this.f10293f, d0Var2);
        return d0Var2;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [W1.P, java.lang.Object] */
    public final void startActivityForResult(Intent intent, int i7) {
        if (this.f10266I == null) {
            throw new IllegalStateException(A3.c.i("Fragment ", this, " not attached to Activity"));
        }
        U E10 = E();
        if (E10.f10342C != null) {
            String str = this.f10293f;
            ?? obj = new Object();
            obj.f10334a = str;
            obj.f10335b = i7;
            E10.f10345F.addLast(obj);
            E10.f10342C.a(intent);
            return;
        }
        F f4 = E10.f10374w;
        f4.getClass();
        kotlin.jvm.internal.l.e(intent, "intent");
        if (i7 != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        AbstractC1449a.startActivity(f4.f10311b, intent, null);
    }

    public Activity t() {
        return A();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append(getClass().getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} (");
        sb2.append(this.f10293f);
        if (this.L != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(this.L));
        }
        if (this.f10270N != null) {
            sb2.append(" tag=");
            sb2.append(this.f10270N);
        }
        sb2.append(")");
        return sb2.toString();
    }

    @Override // l2.InterfaceC1479x
    public final C1481z w() {
        return this.f10288c0;
    }

    public tc.b x() {
        return new C0580x(this);
    }

    public void y(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2;
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.L));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.f10269M));
        printWriter.print(" mTag=");
        printWriter.println(this.f10270N);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f10283a);
        printWriter.print(" mWho=");
        printWriter.print(this.f10293f);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.f10264G);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.f10305z);
        printWriter.print(" mRemoving=");
        printWriter.print(this.f10258A);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.f10260C);
        printWriter.print(" mInLayout=");
        printWriter.println(this.f10261D);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.f10271O);
        printWriter.print(" mDetached=");
        printWriter.print(this.f10272P);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.f10274R);
        printWriter.print(" mHasMenu=");
        printWriter.println(false);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.f10273Q);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.f10279W);
        if (this.f10265H != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.f10265H);
        }
        if (this.f10266I != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.f10266I);
        }
        if (this.f10268K != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.f10268K);
        }
        if (this.f10300u != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.f10300u);
        }
        if (this.f10285b != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f10285b);
        }
        if (this.f10287c != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f10287c);
        }
        if (this.f10289d != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.f10289d);
        }
        C c10 = this.f10301v;
        if (c10 == null) {
            U u3 = this.f10265H;
            c10 = (u3 == null || (str2 = this.f10302w) == null) ? null : u3.f10357c.d(str2);
        }
        if (c10 != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(c10);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.f10303x);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        C0582z c0582z = this.f10280X;
        printWriter.println(c0582z == null ? false : c0582z.f10576a);
        C0582z c0582z2 = this.f10280X;
        if ((c0582z2 == null ? 0 : c0582z2.f10577b) != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            C0582z c0582z3 = this.f10280X;
            printWriter.println(c0582z3 == null ? 0 : c0582z3.f10577b);
        }
        C0582z c0582z4 = this.f10280X;
        if ((c0582z4 == null ? 0 : c0582z4.f10578c) != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            C0582z c0582z5 = this.f10280X;
            printWriter.println(c0582z5 == null ? 0 : c0582z5.f10578c);
        }
        C0582z c0582z6 = this.f10280X;
        if ((c0582z6 == null ? 0 : c0582z6.f10579d) != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            C0582z c0582z7 = this.f10280X;
            printWriter.println(c0582z7 == null ? 0 : c0582z7.f10579d);
        }
        C0582z c0582z8 = this.f10280X;
        if ((c0582z8 == null ? 0 : c0582z8.f10580e) != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            C0582z c0582z9 = this.f10280X;
            printWriter.println(c0582z9 != null ? c0582z9.f10580e : 0);
        }
        if (this.f10276T != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.f10276T);
        }
        if (this.f10277U != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.f10277U);
        }
        if (C() != null) {
            new C1112g(this, s()).f(str, printWriter);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.f10267J + ":");
        this.f10267J.w(X.c.h(str, "  "), fileDescriptor, printWriter, strArr);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, W1.z] */
    public final C0582z z() {
        if (this.f10280X == null) {
            ?? obj = new Object();
            obj.f10583i = null;
            Object obj2 = f10257l0;
            obj.j = obj2;
            obj.k = null;
            obj.f10584l = obj2;
            obj.f10585m = null;
            obj.f10586n = obj2;
            obj.f10587o = 1.0f;
            obj.f10588p = null;
            this.f10280X = obj;
        }
        return this.f10280X;
    }
}
