package u0;

import android.view.MotionEvent;
import ea.C1108c;
import java.util.List;

/* renamed from: u0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2075e {

    /* renamed from: a, reason: collision with root package name */
    public final Object f24754a;

    /* renamed from: b, reason: collision with root package name */
    public final P3.p f24755b;

    /* renamed from: c, reason: collision with root package name */
    public int f24756c;

    public C2075e(List list, P3.p pVar) {
        this.f24754a = list;
        this.f24755b = pVar;
        MotionEvent a9 = a();
        int i7 = 0;
        if (a9 != null) {
            a9.getButtonState();
        }
        MotionEvent a10 = a();
        if (a10 != null) {
            a10.getMetaState();
        }
        MotionEvent a11 = a();
        int i10 = 1;
        if (a11 == null) {
            int size = list.size();
            while (true) {
                if (i7 >= size) {
                    i10 = 3;
                    break;
                }
                C2080j c2080j = (C2080j) list.get(i7);
                if (u.b(c2080j)) {
                    i10 = 2;
                    break;
                } else if (u.a(c2080j)) {
                    break;
                } else {
                    i7++;
                }
            }
        } else {
            int actionMasked = a11.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        switch (actionMasked) {
                            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                                i7 = 6;
                                break;
                            case 9:
                                i7 = 4;
                                break;
                            case 10:
                                i7 = 5;
                                break;
                        }
                        i10 = i7;
                    }
                    i7 = 3;
                    i10 = i7;
                }
                i7 = 2;
                i10 = i7;
            }
            i7 = 1;
            i10 = i7;
        }
        this.f24756c = i10;
    }

    public final MotionEvent a() {
        P3.p pVar = this.f24755b;
        if (pVar != null) {
            return (MotionEvent) ((C1108c) pVar.f7843d).f16830b;
        }
        return null;
    }
}
