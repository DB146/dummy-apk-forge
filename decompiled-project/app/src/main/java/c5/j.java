package c5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import n5.AbstractC1705a;

/* loaded from: classes.dex */
public final class j implements a5.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14392a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final List f14393b;

    public j(ArrayList arrayList) {
        this.f14393b = Collections.unmodifiableList(arrayList);
    }

    public j(List list) {
        this.f14393b = list;
    }

    @Override // a5.g
    public final int b(long j) {
        switch (this.f14392a) {
            case 0:
                return -1;
            default:
                return j < 0 ? 0 : -1;
        }
    }

    @Override // a5.g
    public final long d(int i7) {
        switch (this.f14392a) {
            case 0:
                return 0L;
            default:
                AbstractC1705a.h(i7 == 0);
                return 0L;
        }
    }

    @Override // a5.g
    public final List j(long j) {
        switch (this.f14392a) {
            case 0:
                return this.f14393b;
            default:
                return j >= 0 ? this.f14393b : Collections.emptyList();
        }
    }

    @Override // a5.g
    public final int o() {
        switch (this.f14392a) {
            case 0:
                return 1;
            default:
                return 1;
        }
    }
}
