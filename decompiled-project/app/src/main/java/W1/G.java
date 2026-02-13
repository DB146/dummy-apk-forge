package W1;

import B0.C0215z0;
import P4.C0463k;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import c.AbstractActivityC0867k;
import ea.C1112g;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import l2.C1481z;
import l2.EnumC1474s;
import x1.InterfaceC2257a;

/* loaded from: classes.dex */
public abstract class G extends AbstractActivityC0867k implements k1.b {

    /* renamed from: K, reason: collision with root package name */
    public boolean f10317K;
    public boolean L;

    /* renamed from: I, reason: collision with root package name */
    public final C0463k f10315I = new C0463k(new F(this), 10);

    /* renamed from: J, reason: collision with root package name */
    public final C1481z f10316J = new C1481z(this);

    /* renamed from: M, reason: collision with root package name */
    public boolean f10318M = true;

    public G() {
        ((q3.s) this.f14050d.f23372c).D("android:support:lifecycle", new C0215z0(this, 1));
        final int i7 = 0;
        f(new InterfaceC2257a() { // from class: W1.D
            @Override // x1.InterfaceC2257a
            public final void accept(Object obj) {
                switch (i7) {
                    case 0:
                        this.f10315I.u();
                        return;
                    default:
                        this.f10315I.u();
                        return;
                }
            }
        });
        final int i10 = 1;
        this.f14058z.add(new InterfaceC2257a() { // from class: W1.D
            @Override // x1.InterfaceC2257a
            public final void accept(Object obj) {
                switch (i10) {
                    case 0:
                        this.f10315I.u();
                        return;
                    default:
                        this.f10315I.u();
                        return;
                }
            }
        });
        g(new E(this, 0));
    }

    public static boolean k(U u3) {
        EnumC1474s enumC1474s = EnumC1474s.f19229c;
        boolean z8 = false;
        for (C c10 : u3.f10357c.h()) {
            if (c10 != null) {
                F f4 = c10.f10266I;
                if ((f4 == null ? null : f4.f10314e) != null) {
                    z8 |= k(c10.B());
                }
                l0 l0Var = c10.f10290d0;
                if (l0Var != null) {
                    l0Var.d();
                    if (l0Var.f10506e.f19242d.compareTo(EnumC1474s.f19230d) >= 0) {
                        c10.f10290d0.f10506e.g(enumC1474s);
                        z8 = true;
                    }
                }
                if (c10.f10288c0.f19242d.compareTo(EnumC1474s.f19230d) >= 0) {
                    c10.f10288c0.g(enumC1474s);
                    z8 = true;
                }
            }
        }
        return z8;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003a, code lost:
    
        if (r0.equals("--list-dumpables") == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
    
        if (android.os.Build.VERSION.SDK_INT < 33) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0043, code lost:
    
        if (r0.equals("--dump-dumpable") == false) goto L37;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0010. Please report as an issue. */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (strArr != null && strArr.length != 0) {
            String str2 = strArr[0];
            switch (str2.hashCode()) {
                case -645125871:
                    if (str2.equals("--translation") && Build.VERSION.SDK_INT >= 31) {
                        return;
                    }
                    break;
                case 100470631:
                    break;
                case 472614934:
                    break;
                case 1159329357:
                    if (str2.equals("--contentcapture") && Build.VERSION.SDK_INT >= 29) {
                        return;
                    }
                    break;
                case 1455016274:
                    if (str2.equals("--autofill") && Build.VERSION.SDK_INT >= 26) {
                        return;
                    }
                    break;
            }
        }
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str3 = str + "  ";
        printWriter.print(str3);
        printWriter.print("mCreated=");
        printWriter.print(this.f10317K);
        printWriter.print(" mResumed=");
        printWriter.print(this.L);
        printWriter.print(" mStopped=");
        printWriter.print(this.f10318M);
        if (getApplication() != null) {
            new C1112g(this, s()).f(str3, printWriter);
        }
        ((F) this.f10315I.f8074b).f10313d.w(str, fileDescriptor, printWriter, strArr);
    }

    public final U j() {
        return ((F) this.f10315I.f8074b).f10313d;
    }

    @Override // c.AbstractActivityC0867k, android.app.Activity
    public void onActivityResult(int i7, int i10, Intent intent) {
        this.f10315I.u();
        super.onActivityResult(i7, i10, intent);
    }

    @Override // c.AbstractActivityC0867k, k1.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10316J.d(l2.r.ON_CREATE);
        U u3 = ((F) this.f10315I.f8074b).f10313d;
        u3.f10347H = false;
        u3.f10348I = false;
        u3.f10353O.f10392f = false;
        u3.u(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View onCreateView = ((F) this.f10315I.f8074b).f10313d.f10360f.onCreateView(view, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(view, str, context, attributeSet) : onCreateView;
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View onCreateView = ((F) this.f10315I.f8074b).f10313d.f10360f.onCreateView(null, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(str, context, attributeSet) : onCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ((F) this.f10315I.f8074b).f10313d.l();
        this.f10316J.d(l2.r.ON_DESTROY);
    }

    @Override // c.AbstractActivityC0867k, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i7, MenuItem menuItem) {
        if (super.onMenuItemSelected(i7, menuItem)) {
            return true;
        }
        if (i7 == 6) {
            return ((F) this.f10315I.f8074b).f10313d.j();
        }
        return false;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.L = false;
        ((F) this.f10315I.f8074b).f10313d.u(5);
        this.f10316J.d(l2.r.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        this.f10316J.d(l2.r.ON_RESUME);
        U u3 = ((F) this.f10315I.f8074b).f10313d;
        u3.f10347H = false;
        u3.f10348I = false;
        u3.f10353O.f10392f = false;
        u3.u(7);
    }

    @Override // c.AbstractActivityC0867k, android.app.Activity
    public final void onRequestPermissionsResult(int i7, String[] strArr, int[] iArr) {
        this.f10315I.u();
        super.onRequestPermissionsResult(i7, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        C0463k c0463k = this.f10315I;
        c0463k.u();
        super.onResume();
        this.L = true;
        ((F) c0463k.f8074b).f10313d.A(true);
    }

    @Override // android.app.Activity
    public void onStart() {
        C0463k c0463k = this.f10315I;
        c0463k.u();
        super.onStart();
        this.f10318M = false;
        boolean z8 = this.f10317K;
        F f4 = (F) c0463k.f8074b;
        if (!z8) {
            this.f10317K = true;
            U u3 = f4.f10313d;
            u3.f10347H = false;
            u3.f10348I = false;
            u3.f10353O.f10392f = false;
            u3.u(4);
        }
        f4.f10313d.A(true);
        this.f10316J.d(l2.r.ON_START);
        U u10 = f4.f10313d;
        u10.f10347H = false;
        u10.f10348I = false;
        u10.f10353O.f10392f = false;
        u10.u(5);
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.f10315I.u();
    }

    @Override // android.app.Activity
    public void onStop() {
        U j;
        super.onStop();
        this.f10318M = true;
        do {
            j = j();
            EnumC1474s enumC1474s = EnumC1474s.f19227a;
        } while (k(j));
        U u3 = ((F) this.f10315I.f8074b).f10313d;
        u3.f10348I = true;
        u3.f10353O.f10392f = true;
        u3.u(4);
        this.f10316J.d(l2.r.ON_STOP);
    }
}
