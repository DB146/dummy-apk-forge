package e3;

import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.SearchView$SearchAutoComplete;
import androidx.appcompat.widget.Toolbar;
import androidx.leanback.widget.GridLayoutManager;
import androidx.leanback.widget.picker.DatePicker;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.firebase.auth.FirebaseAuth;
import h3.o;
import i2.AbstractC1304L;
import i2.C1320h;
import i2.C1324l;
import i2.C1326n;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import o.C1740j;
import o.C1747m0;
import v8.C2155i;
import v8.j;

/* renamed from: e3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1077b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16709a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f16710b;

    public /* synthetic */ RunnableC1077b(Object obj, int i7) {
        this.f16709a = i7;
        this.f16710b = obj;
    }

    /* JADX WARN: Type inference failed for: r0v19, types: [m5.H, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z8;
        boolean z10;
        C1740j c1740j;
        boolean a9;
        switch (this.f16709a) {
            case 0:
                AbstractC1084i abstractC1084i = (AbstractC1084i) this.f16710b;
                abstractC1084i.setScrollState(0);
                abstractC1084i.p();
                return;
            case 1:
                C1324l c1324l = (C1324l) this.f16710b;
                AbstractC1304L abstractC1304L = c1324l.f18273b;
                if (abstractC1304L == null) {
                    return;
                }
                C1320h c1320h = c1324l.f18283z.f18285f;
                c1324l.getClass();
                c1320h.b(null, abstractC1304L);
                return;
            case 2:
                C1326n c1326n = (C1326n) this.f16710b;
                if (c1326n.f18288c || c1326n.f18286a.get() == null) {
                    return;
                }
                c1326n.f18287b.startPostponedEnterTransition();
                c1326n.f18288c = true;
                return;
            case 3:
                ((GridLayoutManager) this.f16710b).F0();
                return;
            case 4:
                R7.c cVar = (R7.c) this.f16710b;
                cVar.f8932c = false;
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) cVar.f8934e;
                I1.c cVar2 = bottomSheetBehavior.f15192M;
                if (cVar2 != null && cVar2.f()) {
                    cVar.m(cVar.f8931b);
                    return;
                } else {
                    if (bottomSheetBehavior.L == 2) {
                        bottomSheetBehavior.J(cVar.f8931b);
                        return;
                    }
                    return;
                }
            case 5:
                DatePicker datePicker = (DatePicker) this.f16710b;
                int[] iArr = {datePicker.f13547C, datePicker.f13546B, datePicker.f13548D};
                boolean z11 = true;
                boolean z12 = true;
                for (int i7 = 2; i7 >= 0; i7--) {
                    int i10 = iArr[i7];
                    if (i10 >= 0) {
                        int i11 = DatePicker.f13544K[i7];
                        ArrayList arrayList = datePicker.f18571c;
                        j2.b bVar = arrayList == null ? null : (j2.b) arrayList.get(i10);
                        if (z11) {
                            int i12 = datePicker.f13551G.get(i11);
                            if (i12 != bVar.f18579b) {
                                bVar.f18579b = i12;
                                z8 = true;
                            }
                            z8 = false;
                        } else {
                            int actualMinimum = datePicker.f13553I.getActualMinimum(i11);
                            if (actualMinimum != bVar.f18579b) {
                                bVar.f18579b = actualMinimum;
                                z8 = true;
                            }
                            z8 = false;
                        }
                        if (z12) {
                            int i13 = datePicker.f13552H.get(i11);
                            if (i13 != bVar.f18580c) {
                                bVar.f18580c = i13;
                                z10 = true;
                            }
                            z10 = false;
                        } else {
                            int actualMaximum = datePicker.f13553I.getActualMaximum(i11);
                            if (actualMaximum != bVar.f18580c) {
                                bVar.f18580c = actualMaximum;
                                z10 = true;
                            }
                            z10 = false;
                        }
                        boolean z13 = z8 | z10;
                        z11 &= datePicker.f13553I.get(i11) == datePicker.f13551G.get(i11);
                        z12 &= datePicker.f13553I.get(i11) == datePicker.f13552H.get(i11);
                        ArrayList arrayList2 = datePicker.f18570b;
                        if (z13) {
                            int i14 = iArr[i7];
                            datePicker.f18571c.set(i14, bVar);
                            arrayList2.get(i14).getClass();
                            throw new ClassCastException();
                        }
                        int i15 = iArr[i7];
                        int i16 = datePicker.f13553I.get(i11);
                        j2.b bVar2 = (j2.b) datePicker.f18571c.get(i15);
                        if (bVar2.f18578a != i16) {
                            bVar2.f18578a = i16;
                            if (arrayList2.get(i15) != null) {
                                throw new ClassCastException();
                            }
                        } else {
                            continue;
                        }
                    }
                }
                return;
            case 6:
                this.f16710b.g();
                return;
            case 7:
                Iterator it = ((FirebaseAuth) this.f16710b).f15831d.iterator();
                if (it.hasNext()) {
                    throw o.j(it);
                }
                return;
            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                C1747m0 c1747m0 = (C1747m0) this.f16710b;
                c1747m0.f21549z = null;
                c1747m0.drawableStateChanged();
                return;
            case 9:
                SearchView$SearchAutoComplete searchView$SearchAutoComplete = (SearchView$SearchAutoComplete) this.f16710b;
                if (searchView$SearchAutoComplete.f13012f) {
                    ((InputMethodManager) searchView$SearchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchView$SearchAutoComplete, 0);
                    searchView$SearchAutoComplete.f13012f = false;
                    return;
                }
                return;
            case 10:
                ActionMenuView actionMenuView = ((Toolbar) this.f16710b).f13079a;
                if (actionMenuView == null || (c1740j = actionMenuView.f12977H) == null) {
                    return;
                }
                c1740j.l();
                return;
            default:
                C2155i c2155i = (C2155i) this.f16710b;
                synchronized (c2155i) {
                    a9 = c2155i.a();
                    if (a9) {
                        synchronized (c2155i) {
                            c2155i.f25236b = true;
                        }
                    }
                }
                if (a9) {
                    j c10 = c2155i.f25248q.c();
                    c2155i.f25247p.getClass();
                    if (new Date(System.currentTimeMillis()).before(c10.f25251b)) {
                        c2155i.h();
                        return;
                    }
                    k8.d dVar = (k8.d) c2155i.k;
                    Task d10 = dVar.d();
                    Task c11 = dVar.c();
                    Task<TContinuationResult> continueWithTask = Tasks.whenAllComplete((Task<?>[]) new Task[]{d10, c11}).continueWithTask(c2155i.f25241h, new M9.e(c2155i, d10, c11, 15));
                    Tasks.whenAllComplete((Task<?>[]) new Task[]{continueWithTask}).continueWith(c2155i.f25241h, new n4.b(10, c2155i, continueWithTask));
                    return;
                }
                return;
        }
    }
}
