package m5;

import java.util.Map;

/* renamed from: m5.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1623u implements M6.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20670a;

    @Override // M6.m
    public final boolean apply(Object obj) {
        switch (this.f20670a) {
            case 0:
                return ((String) obj) != null;
            default:
                return ((Map.Entry) obj).getKey() != null;
        }
    }
}
