package U2;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.chip.ChipGroup;
import gb.k;
import gb.l;
import hb.InterfaceC1269b;
import i1.C1290a;
import ia.C1358d;
import ib.C1360b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import jb.InterfaceC1394e;
import kb.C1436a;
import kb.EnumC1437b;
import m6.InterfaceC1633i;
import s6.InterfaceC1997g;
import y7.u0;

/* loaded from: classes.dex */
public final class b implements l {

    /* renamed from: a, reason: collision with root package name */
    public boolean f9506a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f9507b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f9508c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f9509d;

    /* renamed from: e, reason: collision with root package name */
    public Object f9510e;

    public b() {
        this.f9508c = new HashMap();
        this.f9509d = new HashSet();
    }

    public b(Context context, String str, A4.c callback, boolean z8, boolean z10) {
        kotlin.jvm.internal.l.e(context, "context");
        kotlin.jvm.internal.l.e(callback, "callback");
        this.f9508c = context;
        this.f9509d = str;
        this.f9510e = callback;
        this.f9506a = z8;
        this.f9507b = z10;
    }

    public b(l lVar, InterfaceC1394e interfaceC1394e) {
        this.f9508c = lVar;
        this.f9509d = interfaceC1394e;
        this.f9510e = new C1436a();
    }

    @Override // gb.l
    public void a() {
        if (this.f9507b) {
            return;
        }
        this.f9507b = true;
        this.f9506a = true;
        ((l) this.f9508c).a();
    }

    public boolean b(InterfaceC1997g interfaceC1997g) {
        int id = interfaceC1997g.getId();
        HashSet hashSet = (HashSet) this.f9509d;
        if (hashSet.contains(Integer.valueOf(id))) {
            return false;
        }
        InterfaceC1997g interfaceC1997g2 = (InterfaceC1997g) ((HashMap) this.f9508c).get(Integer.valueOf(f()));
        if (interfaceC1997g2 != null) {
            h(interfaceC1997g2, false);
        }
        boolean add = hashSet.add(Integer.valueOf(id));
        if (!interfaceC1997g.isChecked()) {
            interfaceC1997g.setChecked(true);
        }
        return add;
    }

    @Override // gb.l
    public void c(InterfaceC1269b interfaceC1269b) {
        C1436a c1436a = (C1436a) this.f9510e;
        c1436a.getClass();
        EnumC1437b.f(c1436a, interfaceC1269b);
    }

    public ArrayList d(ViewGroup viewGroup) {
        HashSet hashSet = new HashSet((HashSet) this.f9509d);
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
            View childAt = viewGroup.getChildAt(i7);
            if ((childAt instanceof InterfaceC1997g) && hashSet.contains(Integer.valueOf(childAt.getId()))) {
                arrayList.add(Integer.valueOf(childAt.getId()));
            }
        }
        return arrayList;
    }

    @Override // gb.l
    public void e(Object obj) {
        if (this.f9507b) {
            return;
        }
        ((l) this.f9508c).e(obj);
    }

    public int f() {
        if (this.f9506a) {
            HashSet hashSet = (HashSet) this.f9509d;
            if (!hashSet.isEmpty()) {
                return ((Integer) hashSet.iterator().next()).intValue();
            }
        }
        return -1;
    }

    public void g() {
        C1358d c1358d = (C1358d) this.f9510e;
        if (c1358d != null) {
            new HashSet((HashSet) this.f9509d);
            ChipGroup chipGroup = (ChipGroup) c1358d.f18487b;
            InterfaceC1633i interfaceC1633i = chipGroup.f15287u;
            if (interfaceC1633i != null) {
                chipGroup.f15288v.d(chipGroup);
                ChipGroup chipGroup2 = (ChipGroup) ((C1290a) interfaceC1633i).f18187b;
                if (chipGroup2.f15288v.f9506a) {
                    chipGroup2.getCheckedChipId();
                    throw null;
                }
            }
        }
    }

    public boolean h(InterfaceC1997g interfaceC1997g, boolean z8) {
        int id = interfaceC1997g.getId();
        HashSet hashSet = (HashSet) this.f9509d;
        if (!hashSet.contains(Integer.valueOf(id))) {
            return false;
        }
        if (z8 && hashSet.size() == 1 && hashSet.contains(Integer.valueOf(id))) {
            interfaceC1997g.setChecked(true);
            return false;
        }
        boolean remove = hashSet.remove(Integer.valueOf(id));
        if (interfaceC1997g.isChecked()) {
            interfaceC1997g.setChecked(false);
        }
        return remove;
    }

    @Override // gb.l
    public void onError(Throwable th) {
        boolean z8 = this.f9506a;
        l lVar = (l) this.f9508c;
        if (z8) {
            if (this.f9507b) {
                com.bumptech.glide.d.t(th);
                return;
            } else {
                lVar.onError(th);
                return;
            }
        }
        this.f9506a = true;
        try {
            k kVar = (k) ((InterfaceC1394e) this.f9509d).apply(th);
            if (kVar != null) {
                kVar.b(this);
                return;
            }
            NullPointerException nullPointerException = new NullPointerException("Observable is null");
            nullPointerException.initCause(th);
            lVar.onError(nullPointerException);
        } catch (Throwable th2) {
            u0.L(th2);
            lVar.onError(new C1360b(th, th2));
        }
    }
}
