package S9;

/* loaded from: classes2.dex */
public final class d extends M2.a {
    @Override // M2.a
    public final void a(U2.a database) {
        kotlin.jvm.internal.l.e(database, "database");
        database.o("CREATE TABLE IF NOT EXISTS `VideoFavoriteDTO` (`id` TEXT NOT NULL, `url` TEXT NOT NULL, `title` TEXT NOT NULL, `category` TEXT NOT NULL, `logoUrl` TEXT NOT NULL, `sourceFrom` TEXT NOT NULL, `type` TEXT NOT NULL, PRIMARY KEY(`id`, `url`))");
    }
}
