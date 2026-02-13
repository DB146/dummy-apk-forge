package S9;

/* loaded from: classes2.dex */
public final class f extends M2.a {
    @Override // M2.a
    public final void a(U2.a database) {
        kotlin.jvm.internal.l.e(database, "database");
        database.o("CREATE TABLE IF NOT EXISTS `ExtensionsConfig` (`sourceName` TEXT NOT NULL, `sourceUrl` TEXT NOT NULL, `type` TEXT NOT NULL, PRIMARY KEY(`sourceUrl`))");
    }
}
