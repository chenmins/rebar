package com.bedatadriven.rebar.style.rebind.icons;

import com.bedatadriven.rebar.style.rebind.ConsoleTreeLogger;
import com.bedatadriven.rebar.style.rebind.icons.source.GlyphSource;
import com.bedatadriven.rebar.style.rebind.icons.source.ImageSource;
import com.google.common.base.Charsets;
import com.google.common.collect.Maps;
import com.google.gwt.core.ext.UnableToCompleteException;
import com.google.gwt.thirdparty.guava.common.io.Resources;

import java.io.IOException;
import java.util.Map;


public abstract class TestIcons {

  private static SvgDocument fa;

  public static SvgDocument get(String resourceName) throws IOException, UnableToCompleteException {
    ConsoleTreeLogger logger = new ConsoleTreeLogger();
    return new SvgDocument(toString(resourceName));
  }

  public static String toString(String resourceName) throws IOException {
    return Resources.toString(Resources.getResource(SvgDocument.class, resourceName), Charsets.UTF_8);
  }

  public static Icon imageIcon(String name) throws IOException, UnableToCompleteException {
    return new Icon(name, new ImageSource(get(name + ".svg")));
  }

  public static Icon awesome(String name) throws IOException, UnableToCompleteException {
    if (fa == null) {
      fa = get("fontawesome.svg");
    }
    return new Icon(name, new GlyphSource(fa.getFonts().get(0), getFontAwesomeCodePoints().get(name)));
  }

  public static Map<String, Integer> getFontAwesomeCodePoints() {
    Map<String, Integer> map = Maps.newHashMap();
    map.put("fa-glass", 0xf000);
    map.put("fa-music", 0xf001);
    map.put("fa-search", 0xf002);
    map.put("fa-envelope-o", 0xf003);
    map.put("fa-heart", 0xf004);
    map.put("fa-star", 0xf005);
    map.put("fa-star-o", 0xf006);
    map.put("fa-user", 0xf007);
    map.put("fa-film", 0xf008);
    map.put("fa-th-large", 0xf009);
    map.put("fa-th", 0xf00a);
    map.put("fa-th-list", 0xf00b);
    map.put("fa-check", 0xf00c);
    map.put("fa-times", 0xf00d);
    map.put("fa-search-plus", 0xf00e);
    map.put("fa-search-minus", 0xf010);
    map.put("fa-power-off", 0xf011);
    map.put("fa-signal", 0xf012);
    map.put("fa-cog", 0xf013);
    map.put("fa-trash-o", 0xf014);
    map.put("fa-home", 0xf015);
    map.put("fa-file-o", 0xf016);
    map.put("fa-clock-o", 0xf017);
    map.put("fa-road", 0xf018);
    map.put("fa-download", 0xf019);
    map.put("fa-arrow-circle-o-down", 0xf01a);
    map.put("fa-arrow-circle-o-up", 0xf01b);
    map.put("fa-inbox", 0xf01c);
    map.put("fa-play-circle-o", 0xf01d);
    map.put("fa-repeat", 0xf01e);
    map.put("fa-refresh", 0xf021);
    map.put("fa-list-alt", 0xf022);
    map.put("fa-lock", 0xf023);
    map.put("fa-flag", 0xf024);
    map.put("fa-headphones", 0xf025);
    map.put("fa-volume-off", 0xf026);
    map.put("fa-volume-down", 0xf027);
    map.put("fa-volume-up", 0xf028);
    map.put("fa-qrcode", 0xf029);
    map.put("fa-barcode", 0xf02a);
    map.put("fa-tag", 0xf02b);
    map.put("fa-tags", 0xf02c);
    map.put("fa-book", 0xf02d);
    map.put("fa-bookmark", 0xf02e);
    map.put("fa-print", 0xf02f);
    map.put("fa-camera", 0xf030);
    map.put("fa-font", 0xf031);
    map.put("fa-bold", 0xf032);
    map.put("fa-italic", 0xf033);
    map.put("fa-text-height", 0xf034);
    map.put("fa-text-width", 0xf035);
    map.put("fa-align-left", 0xf036);
    map.put("fa-align-center", 0xf037);
    map.put("fa-align-right", 0xf038);
    map.put("fa-align-justify", 0xf039);
    map.put("fa-list", 0xf03a);
    map.put("fa-outdent", 0xf03b);
    map.put("fa-indent", 0xf03c);
    map.put("fa-video-camera", 0xf03d);
    map.put("fa-picture-o", 0xf03e);
    map.put("fa-pencil", 0xf040);
    map.put("fa-map-marker", 0xf041);
    map.put("fa-adjust", 0xf042);
    map.put("fa-tint", 0xf043);
    map.put("fa-pencil-square-o", 0xf044);
    map.put("fa-share-square-o", 0xf045);
    map.put("fa-check-square-o", 0xf046);
    map.put("fa-arrows", 0xf047);
    map.put("fa-step-backward", 0xf048);
    map.put("fa-fast-backward", 0xf049);
    map.put("fa-backward", 0xf04a);
    map.put("fa-play", 0xf04b);
    map.put("fa-pause", 0xf04c);
    map.put("fa-stop", 0xf04d);
    map.put("fa-forward", 0xf04e);
    map.put("fa-fast-forward", 0xf050);
    map.put("fa-step-forward", 0xf051);
    map.put("fa-eject", 0xf052);
    map.put("fa-chevron-left", 0xf053);
    map.put("fa-chevron-right", 0xf054);
    map.put("fa-plus-circle", 0xf055);
    map.put("fa-minus-circle", 0xf056);
    map.put("fa-times-circle", 0xf057);
    map.put("fa-check-circle", 0xf058);
    map.put("fa-question-circle", 0xf059);
    map.put("fa-info-circle", 0xf05a);
    map.put("fa-crosshairs", 0xf05b);
    map.put("fa-times-circle-o", 0xf05c);
    map.put("fa-check-circle-o", 0xf05d);
    map.put("fa-ban", 0xf05e);
    map.put("fa-arrow-left", 0xf060);
    map.put("fa-arrow-right", 0xf061);
    map.put("fa-arrow-up", 0xf062);
    map.put("fa-arrow-down", 0xf063);
    map.put("fa-share", 0xf064);
    map.put("fa-expand", 0xf065);
    map.put("fa-compress", 0xf066);
    map.put("fa-plus", 0xf067);
    map.put("fa-minus", 0xf068);
    map.put("fa-asterisk", 0xf069);
    map.put("fa-exclamation-circle", 0xf06a);
    map.put("fa-gift", 0xf06b);
    map.put("fa-leaf", 0xf06c);
    map.put("fa-fire", 0xf06d);
    map.put("fa-eye", 0xf06e);
    map.put("fa-eye-slash", 0xf070);
    map.put("fa-exclamation-triangle", 0xf071);
    map.put("fa-plane", 0xf072);
    map.put("fa-calendar", 0xf073);
    map.put("fa-random", 0xf074);
    map.put("fa-comment", 0xf075);
    map.put("fa-magnet", 0xf076);
    map.put("fa-chevron-up", 0xf077);
    map.put("fa-chevron-down", 0xf078);
    map.put("fa-retweet", 0xf079);
    map.put("fa-shopping-cart", 0xf07a);
    map.put("fa-folder", 0xf07b);
    map.put("fa-folder-open", 0xf07c);
    map.put("fa-arrows-v", 0xf07d);
    map.put("fa-arrows-h", 0xf07e);
    map.put("fa-bar-chart-o", 0xf080);
    map.put("fa-twitter-square", 0xf081);
    map.put("fa-facebook-square", 0xf082);
    map.put("fa-camera-retro", 0xf083);
    map.put("fa-key", 0xf084);
    map.put("fa-cogs", 0xf085);
    map.put("fa-comments", 0xf086);
    map.put("fa-thumbs-o-up", 0xf087);
    map.put("fa-thumbs-o-down", 0xf088);
    map.put("fa-star-half", 0xf089);
    map.put("fa-heart-o", 0xf08a);
    map.put("fa-sign-out", 0xf08b);
    map.put("fa-linkedin-square", 0xf08c);
    map.put("fa-thumb-tack", 0xf08d);
    map.put("fa-external-link", 0xf08e);
    map.put("fa-sign-in", 0xf090);
    map.put("fa-trophy", 0xf091);
    map.put("fa-github-square", 0xf092);
    map.put("fa-upload", 0xf093);
    map.put("fa-lemon-o", 0xf094);
    map.put("fa-phone", 0xf095);
    map.put("fa-square-o", 0xf096);
    map.put("fa-bookmark-o", 0xf097);
    map.put("fa-phone-square", 0xf098);
    map.put("fa-twitter", 0xf099);
    map.put("fa-facebook", 0xf09a);
    map.put("fa-github", 0xf09b);
    map.put("fa-unlock", 0xf09c);
    map.put("fa-credit-card", 0xf09d);
    map.put("fa-rss", 0xf09e);
    map.put("fa-hdd-o", 0xf0a0);
    map.put("fa-bullhorn", 0xf0a1);
    map.put("fa-bell", 0xf0f3);
    map.put("fa-certificate", 0xf0a3);
    map.put("fa-hand-o-right", 0xf0a4);
    map.put("fa-hand-o-left", 0xf0a5);
    map.put("fa-hand-o-up", 0xf0a6);
    map.put("fa-hand-o-down", 0xf0a7);
    map.put("fa-arrow-circle-left", 0xf0a8);
    map.put("fa-arrow-circle-right", 0xf0a9);
    map.put("fa-arrow-circle-up", 0xf0aa);
    map.put("fa-arrow-circle-down", 0xf0ab);
    map.put("fa-globe", 0xf0ac);
    map.put("fa-wrench", 0xf0ad);
    map.put("fa-tasks", 0xf0ae);
    map.put("fa-filter", 0xf0b0);
    map.put("fa-briefcase", 0xf0b1);
    map.put("fa-arrows-alt", 0xf0b2);
    map.put("fa-users", 0xf0c0);
    map.put("fa-link", 0xf0c1);
    map.put("fa-cloud", 0xf0c2);
    map.put("fa-flask", 0xf0c3);
    map.put("fa-scissors", 0xf0c4);
    map.put("fa-files-o", 0xf0c5);
    map.put("fa-paperclip", 0xf0c6);
    map.put("fa-floppy-o", 0xf0c7);
    map.put("fa-square", 0xf0c8);
    map.put("fa-bars", 0xf0c9);
    map.put("fa-list-ul", 0xf0ca);
    map.put("fa-list-ol", 0xf0cb);
    map.put("fa-strikethrough", 0xf0cc);
    map.put("fa-underline", 0xf0cd);
    map.put("fa-table", 0xf0ce);
    map.put("fa-magic", 0xf0d0);
    map.put("fa-truck", 0xf0d1);
    map.put("fa-pinterest", 0xf0d2);
    map.put("fa-pinterest-square", 0xf0d3);
    map.put("fa-google-plus-square", 0xf0d4);
    map.put("fa-google-plus", 0xf0d5);
    map.put("fa-money", 0xf0d6);
    map.put("fa-caret-down", 0xf0d7);
    map.put("fa-caret-up", 0xf0d8);
    map.put("fa-caret-left", 0xf0d9);
    map.put("fa-caret-right", 0xf0da);
    map.put("fa-columns", 0xf0db);
    map.put("fa-sort", 0xf0dc);
    map.put("fa-sort-asc", 0xf0dd);
    map.put("fa-sort-desc", 0xf0de);
    map.put("fa-envelope", 0xf0e0);
    map.put("fa-linkedin", 0xf0e1);
    map.put("fa-undo", 0xf0e2);
    map.put("fa-gavel", 0xf0e3);
    map.put("fa-tachometer", 0xf0e4);
    map.put("fa-comment-o", 0xf0e5);
    map.put("fa-comments-o", 0xf0e6);
    map.put("fa-bolt", 0xf0e7);
    map.put("fa-sitemap", 0xf0e8);
    map.put("fa-umbrella", 0xf0e9);
    map.put("fa-clipboard", 0xf0ea);
    map.put("fa-lightbulb-o", 0xf0eb);
    map.put("fa-exchange", 0xf0ec);
    map.put("fa-cloud-download", 0xf0ed);
    map.put("fa-cloud-upload", 0xf0ee);
    map.put("fa-user-md", 0xf0f0);
    map.put("fa-stethoscope", 0xf0f1);
    map.put("fa-suitcase", 0xf0f2);
    map.put("fa-bell-o", 0xf0a2);
    map.put("fa-coffee", 0xf0f4);
    map.put("fa-cutlery", 0xf0f5);
    map.put("fa-file-text-o", 0xf0f6);
    map.put("fa-building-o", 0xf0f7);
    map.put("fa-hospital-o", 0xf0f8);
    map.put("fa-ambulance", 0xf0f9);
    map.put("fa-medkit", 0xf0fa);
    map.put("fa-fighter-jet", 0xf0fb);
    map.put("fa-beer", 0xf0fc);
    map.put("fa-h-square", 0xf0fd);
    map.put("fa-plus-square", 0xf0fe);
    map.put("fa-angle-double-left", 0xf100);
    map.put("fa-angle-double-right", 0xf101);
    map.put("fa-angle-double-up", 0xf102);
    map.put("fa-angle-double-down", 0xf103);
    map.put("fa-angle-left", 0xf104);
    map.put("fa-angle-right", 0xf105);
    map.put("fa-angle-up", 0xf106);
    map.put("fa-angle-down", 0xf107);
    map.put("fa-desktop", 0xf108);
    map.put("fa-laptop", 0xf109);
    map.put("fa-tablet", 0xf10a);
    map.put("fa-mobile", 0xf10b);
    map.put("fa-circle-o", 0xf10c);
    map.put("fa-quote-left", 0xf10d);
    map.put("fa-quote-right", 0xf10e);
    map.put("fa-spinner", 0xf110);
    map.put("fa-circle", 0xf111);
    map.put("fa-reply", 0xf112);
    map.put("fa-github-alt", 0xf113);
    map.put("fa-folder-o", 0xf114);
    map.put("fa-folder-open-o", 0xf115);
    map.put("fa-smile-o", 0xf118);
    map.put("fa-frown-o", 0xf119);
    map.put("fa-meh-o", 0xf11a);
    map.put("fa-gamepad", 0xf11b);
    map.put("fa-keyboard-o", 0xf11c);
    map.put("fa-flag-o", 0xf11d);
    map.put("fa-flag-checkered", 0xf11e);
    map.put("fa-terminal", 0xf120);
    map.put("fa-code", 0xf121);
    map.put("fa-reply-all", 0xf122);
    map.put("fa-mail-reply-all", 0xf122);
    map.put("fa-star-half-o", 0xf123);
    map.put("fa-location-arrow", 0xf124);
    map.put("fa-crop", 0xf125);
    map.put("fa-code-fork", 0xf126);
    map.put("fa-chain-broken", 0xf127);
    map.put("fa-question", 0xf128);
    map.put("fa-info", 0xf129);
    map.put("fa-exclamation", 0xf12a);
    map.put("fa-superscript", 0xf12b);
    map.put("fa-subscript", 0xf12c);
    map.put("fa-eraser", 0xf12d);
    map.put("fa-puzzle-piece", 0xf12e);
    map.put("fa-microphone", 0xf130);
    map.put("fa-microphone-slash", 0xf131);
    map.put("fa-shield", 0xf132);
    map.put("fa-calendar-o", 0xf133);
    map.put("fa-fire-extinguisher", 0xf134);
    map.put("fa-rocket", 0xf135);
    map.put("fa-maxcdn", 0xf136);
    map.put("fa-chevron-circle-left", 0xf137);
    map.put("fa-chevron-circle-right", 0xf138);
    map.put("fa-chevron-circle-up", 0xf139);
    map.put("fa-chevron-circle-down", 0xf13a);
    map.put("fa-html5", 0xf13b);
    map.put("fa-css3", 0xf13c);
    map.put("fa-anchor", 0xf13d);
    map.put("fa-unlock-alt", 0xf13e);
    map.put("fa-bullseye", 0xf140);
    map.put("fa-ellipsis-h", 0xf141);
    map.put("fa-ellipsis-v", 0xf142);
    map.put("fa-rss-square", 0xf143);
    map.put("fa-play-circle", 0xf144);
    map.put("fa-ticket", 0xf145);
    map.put("fa-minus-square", 0xf146);
    map.put("fa-minus-square-o", 0xf147);
    map.put("fa-level-up", 0xf148);
    map.put("fa-level-down", 0xf149);
    map.put("fa-check-square", 0xf14a);
    map.put("fa-pencil-square", 0xf14b);
    map.put("fa-external-link-square", 0xf14c);
    map.put("fa-share-square", 0xf14d);
    map.put("fa-compass", 0xf14e);
    map.put("fa-caret-square-o-down", 0xf150);
    map.put("fa-caret-square-o-up", 0xf151);
    map.put("fa-caret-square-o-right", 0xf152);
    map.put("fa-eur", 0xf153);
    map.put("fa-gbp", 0xf154);
    map.put("fa-usd", 0xf155);
    map.put("fa-inr", 0xf156);
    map.put("fa-jpy", 0xf157);
    map.put("fa-rub", 0xf158);
    map.put("fa-krw", 0xf159);
    map.put("fa-btc", 0xf15a);
    map.put("fa-file", 0xf15b);
    map.put("fa-file-text", 0xf15c);
    map.put("fa-sort-alpha-asc", 0xf15d);
    map.put("fa-sort-alpha-desc", 0xf15e);
    map.put("fa-sort-amount-asc", 0xf160);
    map.put("fa-sort-amount-desc", 0xf161);
    map.put("fa-sort-numeric-asc", 0xf162);
    map.put("fa-sort-numeric-desc", 0xf163);
    map.put("fa-thumbs-up", 0xf164);
    map.put("fa-thumbs-down", 0xf165);
    map.put("fa-youtube-square", 0xf166);
    map.put("fa-youtube", 0xf167);
    map.put("fa-xing", 0xf168);
    map.put("fa-xing-square", 0xf169);
    map.put("fa-youtube-play", 0xf16a);
    map.put("fa-dropbox", 0xf16b);
    map.put("fa-stack-overflow", 0xf16c);
    map.put("fa-instagram", 0xf16d);
    map.put("fa-flickr", 0xf16e);
    map.put("fa-adn", 0xf170);
    map.put("fa-bitbucket", 0xf171);
    map.put("fa-bitbucket-square", 0xf172);
    map.put("fa-tumblr", 0xf173);
    map.put("fa-tumblr-square", 0xf174);
    map.put("fa-long-arrow-down", 0xf175);
    map.put("fa-long-arrow-up", 0xf176);
    map.put("fa-long-arrow-left", 0xf177);
    map.put("fa-long-arrow-right", 0xf178);
    map.put("fa-apple", 0xf179);
    map.put("fa-windows", 0xf17a);
    map.put("fa-android", 0xf17b);
    map.put("fa-linux", 0xf17c);
    map.put("fa-dribbble", 0xf17d);
    map.put("fa-skype", 0xf17e);
    map.put("fa-foursquare", 0xf180);
    map.put("fa-trello", 0xf181);
    map.put("fa-female", 0xf182);
    map.put("fa-male", 0xf183);
    map.put("fa-gittip", 0xf184);
    map.put("fa-sun-o", 0xf185);
    map.put("fa-moon-o", 0xf186);
    map.put("fa-archive", 0xf187);
    map.put("fa-bug", 0xf188);
    map.put("fa-vk", 0xf189);
    map.put("fa-weibo", 0xf18a);
    map.put("fa-renren", 0xf18b);
    map.put("fa-pagelines", 0xf18c);
    map.put("fa-stack-exchange", 0xf18d);
    map.put("fa-arrow-circle-o-right", 0xf18e);
    map.put("fa-arrow-circle-o-left", 0xf190);
    map.put("fa-caret-square-o-left", 0xf191);
    map.put("fa-dot-circle-o", 0xf192);
    map.put("fa-wheelchair", 0xf193);
    map.put("fa-vimeo-square", 0xf194);
    map.put("fa-try", 0xf195);
    map.put("fa-plus-square-o", 0xf196);
    return map;
  }

}
