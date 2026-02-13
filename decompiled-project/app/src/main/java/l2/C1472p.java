package l2;

/* renamed from: l2.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1472p {
    public static r a(EnumC1474s state) {
        kotlin.jvm.internal.l.e(state, "state");
        int ordinal = state.ordinal();
        if (ordinal == 1) {
            return r.ON_CREATE;
        }
        if (ordinal == 2) {
            return r.ON_START;
        }
        if (ordinal != 3) {
            return null;
        }
        return r.ON_RESUME;
    }
}
