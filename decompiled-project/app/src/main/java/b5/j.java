package b5;

import java.util.Collections;
import java.util.List;
import n5.AbstractC1705a;

/* loaded from: classes.dex */
public final class j implements a5.g {

    /* renamed from: a, reason: collision with root package name */
    public final List f13974a;

    @Override // a5.g
    public int b(long j) {
        return j < 0 ? 0 : -1;
    }

    @Override // a5.g
    public long d(int i7) {
        AbstractC1705a.h(i7 == 0);
        return 0L;
    }

    @Override // a5.g
    public List j(long j) {
        return j >= 0 ? this.f13974a : Collections.emptyList();
    }

    @Override // a5.g
    public int o() {
        return 1;
    }
}
