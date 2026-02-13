package z;

import B0.e1;
import u0.C2075e;
import u0.C2080j;

/* renamed from: z.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2574v {

    /* renamed from: a, reason: collision with root package name */
    public static final float f28107a = ((float) 0.125d) / 18;

    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List, java.util.Collection, java.lang.Object] */
    public static final boolean a(C2075e c2075e, long j) {
        Object obj;
        ?? r62 = c2075e.f24754a;
        int size = r62.size();
        boolean z8 = false;
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                obj = null;
                break;
            }
            obj = r62.get(i7);
            if (u0.u.d(((C2080j) obj).f24763a, j)) {
                break;
            }
            i7++;
        }
        C2080j c2080j = (C2080j) obj;
        if (c2080j != null && c2080j.f24766d) {
            z8 = true;
        }
        return true ^ z8;
    }

    public static final float b(e1 e1Var, int i7) {
        return u0.u.e(i7, 2) ? e1Var.b() * f28107a : e1Var.b();
    }
}
