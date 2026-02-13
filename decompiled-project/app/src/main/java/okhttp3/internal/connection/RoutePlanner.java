package okhttp3.internal.connection;

import kotlin.jvm.internal.l;
import okhttp3.Address;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public interface RoutePlanner {

    /* loaded from: classes2.dex */
    public static final class ConnectResult {

        /* renamed from: a, reason: collision with root package name */
        public final Plan f22657a;

        /* renamed from: b, reason: collision with root package name */
        public final Plan f22658b;

        /* renamed from: c, reason: collision with root package name */
        public final Throwable f22659c;

        public /* synthetic */ ConnectResult(Plan plan, ConnectPlan connectPlan, Throwable th, int i7) {
            this(plan, (i7 & 2) != 0 ? null : connectPlan, (i7 & 4) != 0 ? null : th);
        }

        public ConnectResult(Plan plan, Plan plan2, Throwable th) {
            this.f22657a = plan;
            this.f22658b = plan2;
            this.f22659c = th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ConnectResult)) {
                return false;
            }
            ConnectResult connectResult = (ConnectResult) obj;
            return l.a(this.f22657a, connectResult.f22657a) && l.a(this.f22658b, connectResult.f22658b) && l.a(this.f22659c, connectResult.f22659c);
        }

        public final int hashCode() {
            int hashCode = this.f22657a.hashCode() * 31;
            Plan plan = this.f22658b;
            int hashCode2 = (hashCode + (plan == null ? 0 : plan.hashCode())) * 31;
            Throwable th = this.f22659c;
            return hashCode2 + (th != null ? th.hashCode() : 0);
        }

        public final String toString() {
            return "ConnectResult(plan=" + this.f22657a + ", nextPlan=" + this.f22658b + ", throwable=" + this.f22659c + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class DefaultImpls {
    }

    /* loaded from: classes2.dex */
    public interface Plan {
        Plan a();

        boolean b();

        void cancel();

        ConnectResult d();

        RealConnection e();

        ConnectResult g();
    }

    boolean a();

    Eb.l b();

    Plan c();

    boolean d(RealConnection realConnection);

    Address e();

    boolean f(HttpUrl httpUrl);
}
