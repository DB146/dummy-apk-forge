package M8;

import J8.AbstractC0352g;
import java.sql.Timestamp;
import java.util.Date;

/* loaded from: classes.dex */
public final class e extends AbstractC0352g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6838b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i7, Class cls) {
        super(cls);
        this.f6838b = i7;
    }

    @Override // J8.AbstractC0352g
    public final Date a(Date date) {
        switch (this.f6838b) {
            case 0:
                return new java.sql.Date(date.getTime());
            default:
                return new Timestamp(date.getTime());
        }
    }
}
