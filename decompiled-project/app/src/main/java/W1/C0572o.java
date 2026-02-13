package W1;

import android.transition.Transition;
import android.transition.TransitionSet;

/* renamed from: W1.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0572o extends C9.h {

    /* renamed from: b, reason: collision with root package name */
    public final Object f10528b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f10529c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f10530d;

    public C0572o(o0 o0Var, boolean z8, boolean z10) {
        super(o0Var);
        Object obj;
        int i7 = o0Var.f10531a;
        TransitionSet transitionSet = null;
        C c10 = o0Var.f10533c;
        if (i7 == 2) {
            if (z8) {
                C0582z c0582z = c10.f10280X;
                if (c0582z != null && c0582z != null) {
                    obj = c0582z.k;
                }
                obj = null;
            } else {
                C0582z c0582z2 = c10.f10280X;
                if (c0582z2 != null) {
                    obj = c0582z2.f10583i;
                }
                obj = null;
            }
        } else if (z8) {
            C0582z c0582z3 = c10.f10280X;
            if (c0582z3 != null && c0582z3 != null) {
                obj = c0582z3.f10583i;
            }
            obj = null;
        } else {
            C0582z c0582z4 = c10.f10280X;
            if (c0582z4 != null) {
                obj = c0582z4.k;
            }
            obj = null;
        }
        this.f10528b = obj;
        if (i7 == 2) {
            if (z8) {
                C0582z c0582z5 = c10.f10280X;
            } else {
                C0582z c0582z6 = c10.f10280X;
            }
        }
        this.f10529c = true;
        if (z10) {
            if (z8) {
                C0582z c0582z7 = c10.f10280X;
                if (c0582z7 != null && c0582z7 != null) {
                    transitionSet = c0582z7.f10585m;
                }
            } else {
                C0582z c0582z8 = c10.f10280X;
                if (c0582z8 != null) {
                    transitionSet = c0582z8.f10585m;
                }
            }
        }
        this.f10530d = transitionSet;
    }

    public final k0 K() {
        Object obj = this.f10528b;
        k0 L = L(obj);
        Object obj2 = this.f10530d;
        k0 L10 = L(obj2);
        if (L == null || L10 == null || L == L10) {
            return L == null ? L10 : L;
        }
        throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + ((o0) this.f3094a).f10533c + " returned Transition " + obj + " which uses a different Transition  type than its shared element transition " + obj2).toString());
    }

    public final k0 L(Object obj) {
        if (obj == null) {
            return null;
        }
        i0 i0Var = d0.f10463a;
        if (obj instanceof Transition) {
            return i0Var;
        }
        k0 k0Var = d0.f10464b;
        if (k0Var != null && k0Var.g(obj)) {
            return k0Var;
        }
        throw new IllegalArgumentException("Transition " + obj + " for fragment " + ((o0) this.f3094a).f10533c + " is not a valid framework Transition or AndroidX Transition");
    }
}
