package n3;

import android.os.Build;
import kotlin.jvm.internal.l;
import o3.C1781a;
import q3.p;

/* renamed from: n3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1699d extends AbstractC1698c {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f21065b;

    /* renamed from: c, reason: collision with root package name */
    public final int f21066c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1699d(C1781a tracker) {
        super(tracker);
        this.f21065b = 1;
        l.e(tracker, "tracker");
        this.f21066c = 5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1699d(o3.e tracker, int i7) {
        super(tracker);
        this.f21065b = i7;
        switch (i7) {
            case 2:
                l.e(tracker, "tracker");
                super(tracker);
                this.f21066c = 7;
                return;
            case 3:
                l.e(tracker, "tracker");
                super(tracker);
                this.f21066c = 7;
                return;
            case 4:
                l.e(tracker, "tracker");
                super(tracker);
                this.f21066c = 9;
                return;
            default:
                l.e(tracker, "tracker");
                this.f21066c = 6;
                return;
        }
    }

    @Override // n3.InterfaceC1700e
    public final boolean b(p workSpec) {
        switch (this.f21065b) {
            case 0:
                l.e(workSpec, "workSpec");
                return workSpec.j.f17684c;
            case 1:
                l.e(workSpec, "workSpec");
                return workSpec.j.f17686e;
            case 2:
                l.e(workSpec, "workSpec");
                return workSpec.j.f17682a == 2;
            case 3:
                l.e(workSpec, "workSpec");
                int i7 = workSpec.j.f17682a;
                return i7 == 3 || (Build.VERSION.SDK_INT >= 30 && i7 == 6);
            default:
                l.e(workSpec, "workSpec");
                return workSpec.j.f17687f;
        }
    }

    @Override // n3.AbstractC1698c
    public final int d() {
        switch (this.f21065b) {
            case 0:
                return this.f21066c;
            case 1:
                return this.f21066c;
            case 2:
                return this.f21066c;
            case 3:
                return this.f21066c;
            default:
                return this.f21066c;
        }
    }

    @Override // n3.AbstractC1698c
    public final boolean e(Object obj) {
        switch (this.f21065b) {
            case 0:
                return !((Boolean) obj).booleanValue();
            case 1:
                return !((Boolean) obj).booleanValue();
            case 2:
                m3.g value = (m3.g) obj;
                l.e(value, "value");
                int i7 = Build.VERSION.SDK_INT;
                boolean z8 = value.f19787a;
                if (i7 >= 26) {
                    if (!z8 || !value.f19788b) {
                        return true;
                    }
                } else if (!z8) {
                    return true;
                }
                return false;
            case 3:
                m3.g value2 = (m3.g) obj;
                l.e(value2, "value");
                return !value2.f19787a || value2.f19789c;
            default:
                return !((Boolean) obj).booleanValue();
        }
    }
}
