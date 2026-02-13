package A8;

import M1.C0388c;
import android.os.Build;
import android.os.Process;
import android.util.Log;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;

/* renamed from: A8.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0053q extends kotlin.jvm.internal.m implements Rb.c {

    /* renamed from: b, reason: collision with root package name */
    public static final C0053q f711b = new C0053q(1, 0);

    /* renamed from: c, reason: collision with root package name */
    public static final C0053q f712c = new C0053q(1, 1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f713a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0053q(int i7, int i10) {
        super(i7);
        this.f713a = i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
    
        r1 = android.app.Application.getProcessName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0071, code lost:
    
        r1 = android.app.Application.getProcessName();
     */
    @Override // Rb.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        String d10;
        String d11;
        switch (this.f713a) {
            case 0:
                C0388c ex = (C0388c) obj;
                kotlin.jvm.internal.l.e(ex, "ex");
                StringBuilder sb2 = new StringBuilder("CorruptionException in settings DataStore in ");
                int i7 = Build.VERSION.SDK_INT;
                if (i7 > 33) {
                    d10 = Process.myProcessName();
                    kotlin.jvm.internal.l.d(d10, "myProcessName()");
                } else if ((i7 < 28 || d10 == null) && (d10 = M5.c.d()) == null) {
                    d10 = "";
                }
                sb2.append(d10);
                sb2.append('.');
                Log.w(FirebaseSessionsRegistrar.TAG, sb2.toString(), ex);
                return new Q1.b(true);
            default:
                C0388c ex2 = (C0388c) obj;
                kotlin.jvm.internal.l.e(ex2, "ex");
                StringBuilder sb3 = new StringBuilder("CorruptionException in sessions DataStore in ");
                int i10 = Build.VERSION.SDK_INT;
                if (i10 > 33) {
                    d11 = Process.myProcessName();
                    kotlin.jvm.internal.l.d(d11, "myProcessName()");
                } else if ((i10 < 28 || d11 == null) && (d11 = M5.c.d()) == null) {
                    d11 = "";
                }
                sb3.append(d11);
                sb3.append('.');
                Log.w(FirebaseSessionsRegistrar.TAG, sb3.toString(), ex2);
                return new Q1.b(true);
        }
    }
}
