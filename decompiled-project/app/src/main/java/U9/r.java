package U9;

import I2.AbstractC0315d;
import W9.e;

/* loaded from: classes2.dex */
public final class r extends AbstractC0315d {
    @Override // I2.AbstractC0315d
    public final void b(T2.c statement, Object obj) {
        e.a entity = (e.a) obj;
        kotlin.jvm.internal.l.e(statement, "statement");
        kotlin.jvm.internal.l.e(entity, "entity");
        String a9 = entity.a();
        if (a9 == null) {
            statement.a(1);
        } else {
            statement.y(1, a9);
        }
        statement.y(2, entity.c());
        statement.y(3, entity.d());
        statement.y(4, entity.b());
    }

    @Override // I2.AbstractC0315d
    public final String c() {
        return "INSERT OR REPLACE INTO `TVChannelUrl` (`src`,`type`,`url`,`tvChannelId`) VALUES (?,?,?,?)";
    }
}
