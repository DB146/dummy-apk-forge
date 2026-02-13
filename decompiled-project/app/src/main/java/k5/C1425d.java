package k5;

import N6.B;
import N6.F;
import N6.H;
import N6.t0;
import P4.m0;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.Arrays;
import r7.C1948d;

/* renamed from: k5.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1425d implements n, Continuation {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f18871a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f18872b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f18873c;

    public /* synthetic */ C1425d(Object obj, Object obj2, boolean z8) {
        this.f18872b = obj;
        this.f18873c = obj2;
        this.f18871a = z8;
    }

    @Override // k5.n
    public t0 h(int i7, m0 m0Var, int[] iArr) {
        q qVar = (q) this.f18872b;
        qVar.getClass();
        C1426e c1426e = new C1426e(qVar);
        F f4 = H.f7232b;
        N6.r.e(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i10 = 0;
        int i11 = 0;
        boolean z8 = false;
        while (i10 < m0Var.f8106a) {
            C1427f c1427f = new C1427f(i7, m0Var, i10, (i) this.f18873c, iArr[i10], this.f18871a, c1426e);
            int i12 = i11 + 1;
            if (objArr.length < i12) {
                objArr = Arrays.copyOf(objArr, B.f(objArr.length, i12));
            } else if (z8) {
                objArr = (Object[]) objArr.clone();
            } else {
                objArr[i11] = c1427f;
                i10++;
                i11++;
            }
            z8 = false;
            objArr[i11] = c1427f;
            i10++;
            i11++;
        }
        return H.D(i11, objArr);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        return (M5.c.f() && ((Integer) task.getResult()).intValue() == 402) ? r8.h.a((Context) this.f18872b, (Intent) this.f18873c, this.f18871a).continueWith(new E2.d(0), new C1948d(1)) : task;
    }
}
