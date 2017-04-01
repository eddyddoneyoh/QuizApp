import javax.swing.*;
import java.sql.*;

/**
 * Created by EdidiongEyo on 12/28/2016.
 */
public class SaveToDatabase {





    private String name1SQL = Admin.part1name.getText();
    private String name1SQL2 = Admin.part1name2.getText();
    private String name1SQL3 = Admin.part1name3.getText();
    private String name1SQL4 = Admin.part1name4.getText();
    private String name1SQL5 = Admin.part1name5.getText();
    private String name1SQL6 = Admin.part1name6.getText();
    private String name1SQLID = Admin.part1ID.getText();

    static String name2SQL = Admin.part2name.getText();
    static String name2SQL2 = Admin.part2name2.getText();
    static String name2SQL3 = Admin.part2name3.getText();
    static String name2SQL4 = Admin.part2name4.getText();
    static String name2SQL5 = Admin.part2name5.getText();
    static String name2SQL6 = Admin.part2name6.getText();
    static String name2SQLID = Admin.part2ID.getText();

    static String name3SQL = Admin.part3name.getText();
    static String name3SQL2 = Admin.part3name2.getText();
    static String name3SQL3 = Admin.part3name3.getText();
    static String name3SQL4 = Admin.part3name4.getText();
    static String name3SQL5 = Admin.part3name5.getText();
    static String name3SQL6 = Admin.part3name6.getText();
    static String name3SQLID = Admin.part3ID.getText();

    static String name4SQL = Admin.part4name.getText();
    static String name4SQL2 = Admin.part4name2.getText();
    static String name4SQL3 = Admin.part4name3.getText();
    static String name4SQL4 = Admin.part4name4.getText();
    static String name4SQL5 = Admin.part4name5.getText();
    static String name4SQL6 = Admin.part4name6.getText();
    static String name4SQLID = Admin.part4ID.getText();

    static String name5SQL = Admin.part5name.getText();
    static String name5SQL2 = Admin.part5name2.getText();
    static String name5SQL3 = Admin.part5name3.getText();
    static String name5SQL4 = Admin.part5name4.getText();
    static String name5SQL5 = Admin.part5name5.getText();
    static String name5SQL6 = Admin.part5name6.getText();
    static String name5SQLID = Admin.part5ID.getText();

    static String name6SQL = Admin.part6name.getText();
    static String name6SQL2 = Admin.part6name2.getText();
    static String name6SQL3 = Admin.part6name3.getText();
    static String name6SQL4 = Admin.part6name4.getText();
    static String name6SQL5 = Admin.part6name5.getText();
    static String name6SQL6 = Admin.part6name6.getText();
    static String name6SQLID = Admin.part6ID.getText();

    static String name7SQL = Admin.part7name.getText();
    static String name7SQL2 = Admin.part7name2.getText();
    static String name7SQL3 = Admin.part7name3.getText();
    static String name7SQL4 = Admin.part7name4.getText();
    static String name7SQL5 = Admin.part7name5.getText();
    static String name7SQL6 = Admin.part7name6.getText();
    static String name7SQLID = Admin.part7ID.getText();

    static String name8SQL = Admin.part8name.getText();
    static String name8SQL2 = Admin.part8name2.getText();
    static String name8SQL3 = Admin.part8name3.getText();
    static String name8SQL4 = Admin.part8name4.getText();
    static String name8SQL5 = Admin.part8name5.getText();
    static String name8SQL6 = Admin.part8name6.getText();
    static String name8SQLID = Admin.part8ID.getText();

    static String name9SQL = Admin.part9name.getText();
    static String name9SQL2 = Admin.part9name2.getText();
    static String name9SQL3 = Admin.part9name3.getText();
    static String name9SQL4 = Admin.part9name4.getText();
    static String name9SQL5 = Admin.part9name5.getText();
    static String name9SQL6 = Admin.part9name6.getText();
    static String name9SQLID = Admin.part9ID.getText();

    static String name10SQL = Admin.part10name.getText();
    static String name10SQL2 = Admin.part10name2.getText();
    static String name10SQL3 = Admin.part10name3.getText();
    static String name10SQL4 = Admin.part10name4.getText();
    static String name10SQL5 = Admin.part10name5.getText();
    static String name10SQL6 = Admin.part10name6.getText();
    static String name10SQLID = Admin.part10ID.getText();

    static String name11SQL = Admin.part11name.getText();
    static String name11SQL2 = Admin.part11name2.getText();
    static String name11SQL3 = Admin.part11name3.getText();
    static String name11SQL4 = Admin.part11name4.getText();
    static String name11SQL5 = Admin.part11name5.getText();
    static String name11SQL6 = Admin.part11name6.getText();
    static String name11SQLID = Admin.part11ID.getText();

    static String name12SQL = Admin.part12name.getText();
    static String name12SQL2 = Admin.part12name2.getText();
    static String name12SQL3 = Admin.part12name3.getText();
    static String name12SQL4 = Admin.part12name4.getText();
    static String name12SQL5 = Admin.part12name5.getText();
    static String name12SQL6 = Admin.part12name6.getText();
    static String name12SQLID = Admin.part12ID.getText();

    static String name13SQL = Admin.part13name.getText();
    static String name13SQL2 = Admin.part13name2.getText();
    static String name13SQL3 = Admin.part13name3.getText();
    static String name13SQL4 = Admin.part13name4.getText();
    static String name13SQL5 = Admin.part13name5.getText();
    static String name13SQL6 = Admin.part13name6.getText();
    static String name13SQLID = Admin.part13ID.getText();

    static String name14SQL = Admin.part14name.getText();
    static String name14SQL2 = Admin.part14name2.getText();
    static String name14SQL3 = Admin.part14name3.getText();
    static String name14SQL4 = Admin.part14name4.getText();
    static String name14SQL5 = Admin.part14name5.getText();
    static String name14SQL6 = Admin.part14name6.getText();
    static String name14SQLID = Admin.part14ID.getText();

    static String name15SQL = Admin.part15name.getText();
    static String name15SQL2 = Admin.part15name2.getText();
    static String name15SQL3 = Admin.part15name3.getText();
    static String name15SQL4 = Admin.part15name4.getText();
    static String name15SQL5 = Admin.part15name5.getText();
    static String name15SQL6 = Admin.part15name6.getText();
    static String name15SQLID = Admin.part15ID.getText();

    static String name16SQL = Admin.part16name.getText();
    static String name16SQL2 = Admin.part16name2.getText();
    static String name16SQL3 = Admin.part16name3.getText();
    static String name16SQL4 = Admin.part16name4.getText();
    static String name16SQL5 = Admin.part16name5.getText();
    static String name16SQL6 = Admin.part16name6.getText();
    static String name16SQLID = Admin.part16ID.getText();

    static String name17SQL = Admin.part17name.getText();
    static String name17SQL2 = Admin.part17name2.getText();
    static String name17SQL3 = Admin.part17name3.getText();
    static String name17SQL4 = Admin.part17name4.getText();
    static String name17SQL5 = Admin.part17name5.getText();
    static String name17SQL6 = Admin.part17name6.getText();
    static String name17SQLID = Admin.part17ID.getText();

    static String name18SQL = Admin.part18name.getText();
    static String name18SQL2 = Admin.part18name2.getText();
    static String name18SQL3 = Admin.part18name3.getText();
    static String name18SQL4 = Admin.part18name4.getText();
    static String name18SQL5 = Admin.part18name5.getText();
    static String name18SQL6 = Admin.part18name6.getText();
    static String name18SQLID = Admin.part18ID.getText();

    static String name19SQL = Admin.part19name.getText();
    static String name19SQL2 = Admin.part19name2.getText();
    static String name19SQL3 = Admin.part19name3.getText();
    static String name19SQL4 = Admin.part19name4.getText();
    static String name19SQL5 = Admin.part19name5.getText();
    static String name19SQL6 = Admin.part19name6.getText();
    static String name19SQLID = Admin.part19ID.getText();

    static String name20SQL = Admin.part20name.getText();
    static String name20SQL2 = Admin.part20name.getText();
    static String name20SQL3 = Admin.part20name3.getText();
    static String name20SQL4 = Admin.part20name4.getText();
    static String name20SQL5 = Admin.part20name5.getText();
    static String name20SQL6 = Admin.part20name6.getText();
    static String name20SQLID = Admin.part20ID.getText();

    static String name21SQL = Admin.part21name.getText();
    static String name21SQL2 = Admin.part21name2.getText();
    static String name21SQL3 = Admin.part21name3.getText();
    static String name21SQL4 = Admin.part21name4.getText();
    static String name21SQL5 = Admin.part21name5.getText();
    static String name21SQL6 = Admin.part21name6.getText();
    static String name21SQLID = Admin.part21ID.getText();

    static String name22SQL = Admin.part22name.getText();
    static String name22SQL2 = Admin.part22name2.getText();
    static String name22SQL3 = Admin.part22name3.getText();
    static String name22SQL4 = Admin.part22name4.getText();
    static String name22SQL5 = Admin.part22name5.getText();
    static String name22SQL6 = Admin.part22name6.getText();
    static String name22SQLID = Admin.part22ID.getText();

    static String name23SQL = Admin.part23name.getText();
    static String name23SQL2 = Admin.part23name2.getText();
    static String name23SQL3 = Admin.part23name3.getText();
    static String name23SQL4 = Admin.part23name4.getText();
    static String name23SQL5 = Admin.part23name5.getText();
    static String name23SQL6 = Admin.part23name6.getText();
    static String name23SQLID = Admin.part23ID.getText();

    static String name24SQL = Admin.part24name.getText();
    static String name24SQL2 = Admin.part24name2.getText();
    static String name24SQL3 = Admin.part24name3.getText();
    static String name24SQL4 = Admin.part24name4.getText();
    static String name24SQL5 = Admin.part24name5.getText();
    static String name24SQL6 = Admin.part24name6.getText();
    static String name24SQLID = Admin.part24ID.getText();

    static String name25SQL = Admin.part25name.getText();
    static String name25SQL2 = Admin.part25name2.getText();
    static String name25SQL3 = Admin.part25name3.getText();
    static String name25SQL4 = Admin.part25name4.getText();
    static String name25SQL5 = Admin.part25name5.getText();
    static String name25SQL6 = Admin.part25name6.getText();
    static String name25SQLID = Admin.part25ID.getText();

    static String name26SQL = Admin.part26name.getText();
    static String name26SQL2 = Admin.part26name2.getText();
    static String name26SQL3 = Admin.part26name3.getText();
    static String name26SQL4 = Admin.part26name4.getText();
    static String name26SQL5 = Admin.part26name5.getText();
    static String name26SQL6 = Admin.part26name6.getText();
    static String name26SQLID = Admin.part26ID.getText();

    static String name27SQL = Admin.part27name.getText();
    static String name27SQL2 = Admin.part27name2.getText();
    static String name27SQL3 = Admin.part27name3.getText();
    static String name27SQL4 = Admin.part27name4.getText();
    static String name27SQL5 = Admin.part27name5.getText();
    static String name27SQL6 = Admin.part27name6.getText();
    static String name27SQLID = Admin.part27ID.getText();

    static String name28SQL = Admin.part28name.getText();
    static String name28SQL2 = Admin.part28name2.getText();
    static String name28SQL3 = Admin.part28name3.getText();
    static String name28SQL4 = Admin.part28name4.getText();
    static String name28SQL5 = Admin.part28name5.getText();
    static String name28SQL6 = Admin.part28name6.getText();
    static String name28SQLID = Admin.part28ID.getText();

    static String name29SQL = Admin.part29name.getText();
    static String name29SQL2 = Admin.part29name2.getText();
    static String name29SQL3 = Admin.part29name3.getText();
    static String name29SQL4 = Admin.part29name4.getText();
    static String name29SQL5 = Admin.part29name5.getText();
    static String name29SQL6 = Admin.part29name6.getText();
    static String name29SQLID = Admin.part29ID.getText();

    static String name30SQL = Admin.part30name.getText();
    static String name30SQL2 = Admin.part30name2.getText();
    static String name30SQL3 = Admin.part30name3.getText();
    static String name30SQL4 = Admin.part30name4.getText();
    static String name30SQL5 = Admin.part30name5.getText();
    static String name30SQL6 = Admin.part30name6.getText();
    static String name30SQLID = Admin.part30ID.getText();

    static String name31SQL = Admin.part31name.getText();
    static String name31SQL2 = Admin.part31name2.getText();
    static String name31SQL3 = Admin.part31name3.getText();
    static String name31SQL4 = Admin.part31name4.getText();
    static String name31SQL5 = Admin.part31name5.getText();
    static String name31SQL6 = Admin.part31name6.getText();
    static String name31SQLID = Admin.part31ID.getText();

    static String name32SQL = Admin.part32name.getText();
    static String name32SQL2 = Admin.part32name2.getText();
    static String name32SQL3 = Admin.part32name3.getText();
    static String name32SQL4 = Admin.part32name4.getText();
    static String name32SQL5 = Admin.part32name5.getText();
    static String name32SQL6 = Admin.part32name6.getText();
    static String name32SQLID = Admin.part32ID.getText();

    static String name33SQL = Admin.part33name.getText();
    static String name33SQL2 = Admin.part33name2.getText();
    static String name33SQL3 = Admin.part33name3.getText();
    static String name33SQL4 = Admin.part33name4.getText();
    static String name33SQL5 = Admin.part33name5.getText();
    static String name33SQL6 = Admin.part33name6.getText();
    static String name33SQLID = Admin.part33ID.getText();

    static String name34SQL = Admin.part34name.getText();
    static String name34SQL2 = Admin.part34name2.getText();
    static String name34SQL3 = Admin.part34name3.getText();
    static String name34SQL4 = Admin.part34name4.getText();
    static String name34SQL5 = Admin.part34name5.getText();
    static String name34SQL6 = Admin.part34name6.getText();
    static String name34SQLID = Admin.part34ID.getText();

    static String name35SQL = Admin.part35name.getText();
    static String name35SQL2 = Admin.part35name2.getText();
    static String name35SQL3 = Admin.part35name3.getText();
    static String name35SQL4 = Admin.part35name4.getText();
    static String name35SQL5 = Admin.part35name5.getText();
    static String name35SQL6 = Admin.part35name6.getText();
    static String name35SQLID = Admin.part35ID.getText();

    static String name36SQL = Admin.part36name.getText();
    static String name36SQL2 = Admin.part36name2.getText();
    static String name36SQL3 = Admin.part36name3.getText();
    static String name36SQL4 = Admin.part36name4.getText();
    static String name36SQL5 = Admin.part36name5.getText();
    static String name36SQL6 = Admin.part36name6.getText();
    static String name36SQLID = Admin.part36ID.getText();

    static String name37SQL = Admin.part37name.getText();
    static String name37SQL2 = Admin.part37name2.getText();
    static String name37SQL3 = Admin.part37name3.getText();
    static String name37SQL4 = Admin.part37name4.getText();
    static String name37SQL5 = Admin.part37name5.getText();
    static String name37SQL6 = Admin.part37name6.getText();
    static String name37SQLID = Admin.part37ID.getText();

    static String name38SQL = Admin.part38name.getText();
    static String name38SQL2 = Admin.part38name2.getText();
    static String name38SQL3 = Admin.part38name3.getText();
    static String name38SQL4 = Admin.part38name4.getText();
    static String name38SQL5 = Admin.part38name5.getText();
    static String name38SQL6 = Admin.part38name6.getText();
    static String name38SQLID = Admin.part38ID.getText();

    static String name39SQL = Admin.part39name.getText();
    static String name39SQL2 = Admin.part39name2.getText();
    static String name39SQL3 = Admin.part39name3.getText();
    static String name39SQL4 = Admin.part39name4.getText();
    static String name39SQL5 = Admin.part39name5.getText();
    static String name39SQL6 = Admin.part39name6.getText();
    static String name39SQLID = Admin.part39ID.getText();

    static String name40SQL = Admin.part40name.getText();
    static String name40SQL2 = Admin.part40name2.getText();
    static String name40SQL3 = Admin.part40name3.getText();
    static String name40SQL4 = Admin.part40name4.getText();
    static String name40SQL5 = Admin.part40name5.getText();
    static String name40SQL6 = Admin.part40name6.getText();
    static String name40SQLID = Admin.part40ID.getText();

    static String name41SQL = Admin.part41name.getText();
    static String name41SQL2 = Admin.part41name2.getText();
    static String name41SQL3 = Admin.part41name3.getText();
    static String name41SQL4 = Admin.part41name4.getText();
    static String name41SQL5 = Admin.part41name5.getText();
    static String name41SQL6 = Admin.part41name6.getText();
    static String name41SQLID = Admin.part41ID.getText();

    static String name42SQL = Admin.part42name.getText();
    static String name42SQL2 = Admin.part42name2.getText();
    static String name42SQL3 = Admin.part42name3.getText();
    static String name42SQL4 = Admin.part42name4.getText();
    static String name42SQL5 = Admin.part42name5.getText();
    static String name42SQL6 = Admin.part42name6.getText();
    static String name42SQLID = Admin.part42ID.getText();

    static String name43SQL = Admin.part43name.getText();
    static String name43SQL2 = Admin.part43name2.getText();
    static String name43SQL3 = Admin.part43name3.getText();
    static String name43SQL4 = Admin.part43name4.getText();
    static String name43SQL5 = Admin.part43name5.getText();
    static String name43SQL6 = Admin.part43name6.getText();
    static String name43SQLID = Admin.part43ID.getText();

    static String name44SQL = Admin.part44name.getText();
    static String name44SQL2 = Admin.part44name2.getText();
    static String name44SQL3 = Admin.part44name3.getText();
    static String name44SQL4 = Admin.part44name4.getText();
    static String name44SQL5 = Admin.part44name5.getText();
    static String name44SQL6 = Admin.part44name6.getText();
    static String name44SQLID = Admin.part44ID.getText();

    static String name45SQL = Admin.part45name.getText();
    static String name45SQL2 = Admin.part45name2.getText();
    static String name45SQL3 = Admin.part45name3.getText();
    static String name45SQL4 = Admin.part45name4.getText();
    static String name45SQL5 = Admin.part45name5.getText();
    static String name45SQL6 = Admin.part45name6.getText();
    static String name45SQLID = Admin.part45ID.getText();

    static String name46SQL = Admin.part46name.getText();
    static String name46SQL2 = Admin.part46name2.getText();
    static String name46SQL3 = Admin.part46name3.getText();
    static String name46SQL4 = Admin.part46name4.getText();
    static String name46SQL5 = Admin.part46name5.getText();
    static String name46SQL6 = Admin.part46name6.getText();
    static String name46SQLID = Admin.part46ID.getText();

    static String name47SQL = Admin.part47name.getText();
    static String name47SQL2 = Admin.part47name2.getText();
    static String name47SQL3 = Admin.part47name3.getText();
    static String name47SQL4 = Admin.part47name4.getText();
    static String name47SQL5 = Admin.part47name5.getText();
    static String name47SQL6 = Admin.part47name6.getText();
    static String name47SQLID = Admin.part47ID.getText();

    static String name48SQL = Admin.part48name.getText();
    static String name48SQL2 = Admin.part48name2.getText();
    static String name48SQL3 = Admin.part48name3.getText();
    static String name48SQL4 = Admin.part48name4.getText();
    static String name48SQL5 = Admin.part48name5.getText();
    static String name48SQL6 = Admin.part48name6.getText();
    static String name48SQLID = Admin.part48ID.getText();

    static String name49SQL = Admin.part49name.getText();
    static String name49SQL2 = Admin.part49name2.getText();
    static String name49SQL3 = Admin.part49name3.getText();
    static String name49SQL4 = Admin.part49name4.getText();
    static String name49SQL5 = Admin.part49name5.getText();
    static String name49SQL6 = Admin.part49name6.getText();
    static String name49SQLID = Admin.part49ID.getText();

    static String name50SQL = Admin.part50name.getText();
    static String name50SQL2 = Admin.part50name2.getText();
    static String name50SQL3 = Admin.part50name3.getText();
    static String name50SQL4 = Admin.part50name4.getText();
    static String name50SQL5 = Admin.part50name5.getText();
    static String name50SQL6 = Admin.part50name6.getText();
    static String name50SQLID = Admin.part50ID.getText();

    static String name51SQL = Admin.part51name.getText();
    static String name51SQL2 = Admin.part51name2.getText();
    static String name51SQL3 = Admin.part51name3.getText();
    static String name51SQL4 = Admin.part51name4.getText();
    static String name51SQL5 = Admin.part51name5.getText();
    static String name51SQL6 = Admin.part51name6.getText();
    static String name51SQLID = Admin.part51ID.getText();

    static String name52SQL = Admin.part52name.getText();
    static String name52SQL2 = Admin.part52name2.getText();
    static String name52SQL3 = Admin.part52name3.getText();
    static String name52SQL4 = Admin.part52name4.getText();
    static String name52SQL5 = Admin.part52name5.getText();
    static String name52SQL6 = Admin.part52name6.getText();
    static String name52SQLID = Admin.part52ID.getText();

    static String name53SQL = Admin.part53name.getText();
    static String name53SQL2 = Admin.part53name2.getText();
    static String name53SQL3 = Admin.part53name3.getText();
    static String name53SQL4 = Admin.part53name4.getText();
    static String name53SQL5 = Admin.part53name5.getText();
    static String name53SQL6 = Admin.part53name6.getText();
    static String name53SQLID = Admin.part53ID.getText();

    static String name54SQL = Admin.part54name.getText();
    static String name54SQL2 = Admin.part54name2.getText();
    static String name54SQL3 = Admin.part54name3.getText();
    static String name54SQL4 = Admin.part54name4.getText();
    static String name54SQL5 = Admin.part54name5.getText();
    static String name54SQL6 = Admin.part54name6.getText();
    static String name54SQLID = Admin.part54ID.getText();

    static String name55SQL = Admin.part55name.getText();
    static String name55SQL2 = Admin.part55name2.getText();
    static String name55SQL3 = Admin.part55name3.getText();
    static String name55SQL4 = Admin.part55name4.getText();
    static String name55SQL5 = Admin.part55name5.getText();
    static String name55SQL6 = Admin.part55name6.getText();
    static String name55SQLID = Admin.part55ID.getText();

    static String name56SQL = Admin.part56name.getText();
    static String name56SQL2 = Admin.part56name2.getText();
    static String name56SQL3 = Admin.part56name3.getText();
    static String name56SQL4 = Admin.part56name4.getText();
    static String name56SQL5 = Admin.part56name5.getText();
    static String name56SQL6 = Admin.part56name6.getText();
    static String name56SQLID = Admin.part56ID.getText();

    static String name57SQL = Admin.part57name.getText();
    static String name57SQL2 = Admin.part57name2.getText();
    static String name57SQL3 = Admin.part57name3.getText();
    static String name57SQL4 = Admin.part57name4.getText();
    static String name57SQL5 = Admin.part57name5.getText();
    static String name57SQL6 = Admin.part57name6.getText();
    static String name57SQLID = Admin.part57ID.getText();

    static String name58SQL = Admin.part58name.getText();
    static String name58SQL2 = Admin.part58name2.getText();
    static String name58SQL3 = Admin.part58name3.getText();
    static String name58SQL4 = Admin.part58name4.getText();
    static String name58SQL5 = Admin.part58name5.getText();
    static String name58SQL6 = Admin.part58name6.getText();
    static String name58SQLID = Admin.part58ID.getText();

    static String name59SQL = Admin.part59name.getText();
    static String name59SQL2 = Admin.part59name2.getText();
    static String name59SQL3 = Admin.part59name3.getText();
    static String name59SQL4 = Admin.part59name4.getText();
    static String name59SQL5 = Admin.part59name5.getText();
    static String name59SQL6 = Admin.part59name6.getText();
    static String name59SQLID = Admin.part59ID.getText();

    static String name60SQL = Admin.part60name.getText();
    static String name60SQL2 = Admin.part60name2.getText();
    static String name60SQL3 = Admin.part60name3.getText();
    static String name60SQL4 = Admin.part60name4.getText();
    static String name60SQL5 = Admin.part60name5.getText();
    static String name60SQL6 = Admin.part60name6.getText();
    static String name60SQLID = Admin.part60ID.getText();

    static String name61SQL = Admin.part61name.getText();
    static String name61SQL2 = Admin.part61name2.getText();
    static String name61SQL3 = Admin.part61name3.getText();
    static String name61SQL4 = Admin.part61name4.getText();
    static String name61SQL5 = Admin.part61name5.getText();
    static String name61SQL6 = Admin.part61name6.getText();
    static String name61SQLID = Admin.part61ID.getText();

    static String name62SQL = Admin.part62name.getText();
    static String name62SQL2 = Admin.part62name2.getText();
    static String name62SQL3 = Admin.part62name3.getText();
    static String name62SQL4 = Admin.part62name4.getText();
    static String name62SQL5 = Admin.part62name5.getText();
    static String name62SQL6 = Admin.part62name6.getText();
    static String name62SQLID = Admin.part62ID.getText();

    static String name63SQL = Admin.part63name.getText();
    static String name63SQL2 = Admin.part63name2.getText();
    static String name63SQL3 = Admin.part63name3.getText();
    static String name63SQL4 = Admin.part63name4.getText();
    static String name63SQL5 = Admin.part63name5.getText();
    static String name63SQL6 = Admin.part63name6.getText();
    static String name63SQLID = Admin.part63ID.getText();

    static String name64SQL = Admin.part64name.getText();
    static String name64SQL2 = Admin.part64name2.getText();
    static String name64SQL3 = Admin.part64name3.getText();
    static String name64SQL4 = Admin.part64name4.getText();
    static String name64SQL5 = Admin.part64name5.getText();
    static String name64SQL6 = Admin.part64name6.getText();
    static String name64SQLID = Admin.part64ID.getText();

    static String name65SQL = Admin.part65name.getText();
    static String name65SQL2 = Admin.part65name2.getText();
    static String name65SQL3 = Admin.part65name3.getText();
    static String name65SQL4 = Admin.part65name4.getText();
    static String name65SQL5 = Admin.part65name5.getText();
    static String name65SQL6 = Admin.part65name6.getText();
    static String name65SQLID = Admin.part65ID.getText();

    static String name66SQL = Admin.part66name.getText();
    static String name66SQL2 = Admin.part66name2.getText();
    static String name66SQL3 = Admin.part66name3.getText();
    static String name66SQL4 = Admin.part66name4.getText();
    static String name66SQL5 = Admin.part66name5.getText();
    static String name66SQL6 = Admin.part66name6.getText();
    static String name66SQLID = Admin.part66ID.getText();

    static String name67SQL = Admin.part67name.getText();
    static String name67SQL2 = Admin.part67name2.getText();
    static String name67SQL3 = Admin.part67name3.getText();
    static String name67SQL4 = Admin.part67name4.getText();
    static String name67SQL5 = Admin.part67name5.getText();
    static String name67SQL6 = Admin.part67name6.getText();
    static String name67SQLID = Admin.part67ID.getText();

    static String name68SQL = Admin.part68name.getText();
    static String name68SQL2 = Admin.part68name2.getText();
    static String name68SQL3 = Admin.part68name3.getText();
    static String name68SQL4 = Admin.part68name4.getText();
    static String name68SQL5 = Admin.part68name5.getText();
    static String name68SQL6 = Admin.part68name6.getText();
    static String name68SQLID = Admin.part68ID.getText();

    static String name69SQL = Admin.part69name.getText();
    static String name69SQL2 = Admin.part69name2.getText();
    static String name69SQL3 = Admin.part69name3.getText();
    static String name69SQL4 = Admin.part69name4.getText();
    static String name69SQL5 = Admin.part69name5.getText();
    static String name69SQL6 = Admin.part69name6.getText();
    static String name69SQLID = Admin.part69ID.getText();


    static String name70SQL = Admin.part70name.getText();
    static String name70SQL2 = Admin.part70name2.getText();
    static String name70SQL3 = Admin.part70name3.getText();
    static String name70SQL4 = Admin.part70name4.getText();
    static String name70SQL5 = Admin.part70name5.getText();
    static String name70SQL6 = Admin.part70name6.getText();
    static String name70SQLID = Admin.part70ID.getText();

    static String name71SQL = Admin.part71name.getText();
    static String name71SQL2 = Admin.part71name2.getText();
    static String name71SQL3 = Admin.part71name3.getText();
    static String name71SQL4 = Admin.part71name4.getText();
    static String name71SQL5 = Admin.part71name5.getText();
    static String name71SQL6 = Admin.part71name6.getText();
    static String name71SQLID = Admin.part71ID.getText();

    static String name72SQL = Admin.part72name.getText();
    static String name72SQL2 = Admin.part72name2.getText();
    static String name72SQL3 = Admin.part72name3.getText();
    static String name72SQL4 = Admin.part72name4.getText();
    static String name72SQL5 = Admin.part72name5.getText();
    static String name72SQL6 = Admin.part72name6.getText();
    static String name72SQLID = Admin.part72ID.getText();

    static String name73SQL = Admin.part73name.getText();
    static String name73SQL2 = Admin.part73name2.getText();
    static String name73SQL3 = Admin.part73name3.getText();
    static String name73SQL4 = Admin.part73name4.getText();
    static String name73SQL5 = Admin.part73name5.getText();
    static String name73SQL6 = Admin.part73name6.getText();
    static String name73SQLID = Admin.part73ID.getText();

    static String name74SQL = Admin.part74name.getText();
    static String name74SQL2 = Admin.part74name2.getText();
    static String name74SQL3 = Admin.part74name3.getText();
    static String name74SQL4 = Admin.part74name4.getText();
    static String name74SQL5 = Admin.part74name5.getText();
    static String name74SQL6 = Admin.part74name6.getText();
    static String name74SQLID = Admin.part74ID.getText();

    static String name75SQL = Admin.part75name.getText();
    static String name75SQL2 = Admin.part75name2.getText();
    static String name75SQL3 = Admin.part75name3.getText();
    static String name75SQL4 = Admin.part75name4.getText();
    static String name75SQL5 = Admin.part75name5.getText();
    static String name75SQL6 = Admin.part75name6.getText();
    static String name75SQLID = Admin.part75ID.getText();

    static String name76SQL = Admin.part76name.getText();
    static String name76SQL2 = Admin.part76name2.getText();
    static String name76SQL3 = Admin.part76name3.getText();
    static String name76SQL4 = Admin.part76name4.getText();
    static String name76SQL5 = Admin.part76name5.getText();
    static String name76SQL6 = Admin.part76name6.getText();
    static String name76SQLID = Admin.part76ID.getText();

    static String name77SQL = Admin.part77name.getText();
    static String name77SQL2 = Admin.part77name2.getText();
    static String name77SQL3 = Admin.part77name3.getText();
    static String name77SQL4 = Admin.part77name4.getText();
    static String name77SQL5 = Admin.part77name5.getText();
    static String name77SQL6 = Admin.part77name6.getText();
    static String name77SQLID = Admin.part77ID.getText();

    static String name78SQL = Admin.part78name.getText();
    static String name78SQL2 = Admin.part78name2.getText();
    static String name78SQL3 = Admin.part78name3.getText();
    static String name78SQL4 = Admin.part78name4.getText();
    static String name78SQL5 = Admin.part78name5.getText();
    static String name78SQL6 = Admin.part78name6.getText();
    static String name78SQLID = Admin.part78ID.getText();

    static String name79SQL = Admin.part79name.getText();
    static String name79SQL2 = Admin.part79name2.getText();
    static String name79SQL3 = Admin.part79name3.getText();
    static String name79SQL4 = Admin.part79name4.getText();
    static String name79SQL5 = Admin.part79name5.getText();
    static String name79SQL6 = Admin.part79name6.getText();
    static String name79SQLID = Admin.part79ID.getText();

    static String name80SQL = Admin.part80name.getText();
    static String name80SQL2 = Admin.part80name.getText();
    static String name80SQL3 = Admin.part80name3.getText();
    static String name80SQL4 = Admin.part80name4.getText();
    static String name80SQL5 = Admin.part80name5.getText();
    static String name80SQL6 = Admin.part80name6.getText();
    static String name80SQLID = Admin.part80ID.getText();

    static String name81SQL = Admin.part81name.getText();
    static String name81SQL2 = Admin.part81name2.getText();
    static String name81SQL3 = Admin.part81name3.getText();
    static String name81SQL4 = Admin.part81name4.getText();
    static String name81SQL5 = Admin.part81name5.getText();
    static String name81SQL6 = Admin.part81name6.getText();
    static String name81SQLID = Admin.part81ID.getText();

    static String name82SQL = Admin.part82name.getText();
    static String name82SQL2 = Admin.part82name2.getText();
    static String name82SQL3 = Admin.part82name3.getText();
    static String name82SQL4 = Admin.part82name4.getText();
    static String name82SQL5 = Admin.part82name5.getText();
    static String name82SQL6 = Admin.part82name6.getText();
    static String name82SQLID = Admin.part82ID.getText();

    static String name83SQL = Admin.part83name.getText();
    static String name83SQL2 = Admin.part83name2.getText();
    static String name83SQL3 = Admin.part83name3.getText();
    static String name83SQL4 = Admin.part83name4.getText();
    static String name83SQL5 = Admin.part83name5.getText();
    static String name83SQL6 = Admin.part83name6.getText();
    static String name83SQLID = Admin.part83ID.getText();

    static String name84SQL = Admin.part84name.getText();
    static String name84SQL2 = Admin.part84name2.getText();
    static String name84SQL3 = Admin.part84name3.getText();
    static String name84SQL4 = Admin.part84name4.getText();
    static String name84SQL5 = Admin.part84name5.getText();
    static String name84SQL6 = Admin.part84name6.getText();
    static String name84SQLID = Admin.part84ID.getText();

    static String name85SQL = Admin.part85name.getText();
    static String name85SQL2 = Admin.part85name2.getText();
    static String name85SQL3 = Admin.part85name3.getText();
    static String name85SQL4 = Admin.part85name4.getText();
    static String name85SQL5 = Admin.part85name5.getText();
    static String name85SQL6 = Admin.part85name6.getText();
    static String name85SQLID = Admin.part85ID.getText();

    static String name86SQL = Admin.part86name.getText();
    static String name86SQL2 = Admin.part86name2.getText();
    static String name86SQL3 = Admin.part86name3.getText();
    static String name86SQL4 = Admin.part86name4.getText();
    static String name86SQL5 = Admin.part86name5.getText();
    static String name86SQL6 = Admin.part86name6.getText();
    static String name86SQLID = Admin.part86ID.getText();

    static String name87SQL = Admin.part87name.getText();
    static String name87SQL2 = Admin.part87name2.getText();
    static String name87SQL3 = Admin.part87name3.getText();
    static String name87SQL4 = Admin.part87name4.getText();
    static String name87SQL5 = Admin.part87name5.getText();
    static String name87SQL6 = Admin.part87name6.getText();
    static String name87SQLID = Admin.part87ID.getText();

    static String name88SQL = Admin.part88name.getText();
    static String name88SQL2 = Admin.part88name2.getText();
    static String name88SQL3 = Admin.part88name3.getText();
    static String name88SQL4 = Admin.part88name4.getText();
    static String name88SQL5 = Admin.part88name5.getText();
    static String name88SQL6 = Admin.part88name6.getText();
    static String name88SQLID = Admin.part88ID.getText();

    static String name89SQL = Admin.part89name.getText();
    static String name89SQL2 = Admin.part89name2.getText();
    static String name89SQL3 = Admin.part89name3.getText();
    static String name89SQL4 = Admin.part89name4.getText();
    static String name89SQL5 = Admin.part89name5.getText();
    static String name89SQL6 = Admin.part89name6.getText();
    static String name89SQLID = Admin.part89ID.getText();

    static String name90SQL = Admin.part90name.getText();
    static String name90SQL2 = Admin.part90name2.getText();
    static String name90SQL3 = Admin.part90name3.getText();
    static String name90SQL4 = Admin.part90name4.getText();
    static String name90SQL5 = Admin.part90name5.getText();
    static String name90SQL6 = Admin.part90name6.getText();
    static String name90SQLID = Admin.part90ID.getText();

    static String name91SQL = Admin.part91name.getText();
    static String name91SQL2 = Admin.part91name2.getText();
    static String name91SQL3 = Admin.part91name3.getText();
    static String name91SQL4 = Admin.part91name4.getText();
    static String name91SQL5 = Admin.part91name5.getText();
    static String name91SQL6 = Admin.part91name6.getText();
    static String name91SQLID = Admin.part91ID.getText();

    static String name92SQL = Admin.part92name.getText();
    static String name92SQL2 = Admin.part92name2.getText();
    static String name92SQL3 = Admin.part92name3.getText();
    static String name92SQL4 = Admin.part92name4.getText();
    static String name92SQL5 = Admin.part92name5.getText();
    static String name92SQL6 = Admin.part92name6.getText();
    static String name92SQLID = Admin.part92ID.getText();

    static String name93SQL = Admin.part93name.getText();
    static String name93SQL2 = Admin.part93name2.getText();
    static String name93SQL3 = Admin.part93name3.getText();
    static String name93SQL4 = Admin.part93name4.getText();
    static String name93SQL5 = Admin.part93name5.getText();
    static String name93SQL6 = Admin.part93name6.getText();
    static String name93SQLID = Admin.part93ID.getText();

    static String name94SQL = Admin.part94name.getText();
    static String name94SQL2 = Admin.part94name2.getText();
    static String name94SQL3 = Admin.part94name3.getText();
    static String name94SQL4 = Admin.part94name4.getText();
    static String name94SQL5 = Admin.part94name5.getText();
    static String name94SQL6 = Admin.part94name6.getText();
    static String name94SQLID = Admin.part94ID.getText();

    static String name95SQL = Admin.part95name.getText();
    static String name95SQL2 = Admin.part95name2.getText();
    static String name95SQL3 = Admin.part95name3.getText();
    static String name95SQL4 = Admin.part95name4.getText();
    static String name95SQL5 = Admin.part95name5.getText();
    static String name95SQL6 = Admin.part95name6.getText();
    static String name95SQLID = Admin.part95ID.getText();

    static String name96SQL = Admin.part96name.getText();
    static String name96SQL2 = Admin.part96name2.getText();
    static String name96SQL3 = Admin.part96name3.getText();
    static String name96SQL4 = Admin.part96name4.getText();
    static String name96SQL5 = Admin.part96name5.getText();
    static String name96SQL6 = Admin.part96name6.getText();
    static String name96SQLID = Admin.part96ID.getText();

    static String name97SQL = Admin.part97name.getText();
    static String name97SQL2 = Admin.part97name2.getText();
    static String name97SQL3 = Admin.part97name3.getText();
    static String name97SQL4 = Admin.part97name4.getText();
    static String name97SQL5 = Admin.part97name5.getText();
    static String name97SQL6 = Admin.part97name6.getText();
    static String name97SQLID = Admin.part97ID.getText();

    static String name98SQL = Admin.part98name.getText();
    static String name98SQL2 = Admin.part98name2.getText();
    static String name98SQL3 = Admin.part98name3.getText();
    static String name98SQL4 = Admin.part98name4.getText();
    static String name98SQL5 = Admin.part98name5.getText();
    static String name98SQL6 = Admin.part98name6.getText();
    static String name98SQLID = Admin.part98ID.getText();

    static String name99SQL = Admin.part99name.getText();
    static String name99SQL2 = Admin.part99name2.getText();
    static String name99SQL3 = Admin.part99name3.getText();
    static String name99SQL4 = Admin.part99name4.getText();
    static String name99SQL5 = Admin.part99name5.getText();
    static String name99SQL6 = Admin.part99name6.getText();
    static String name99SQLID = Admin.part99ID.getText();

    static String name100SQL = Admin.part100name.getText();
    static String name100SQL2 = Admin.part100name2.getText();
    static String name100SQL3 = Admin.part100name3.getText();
    static String name100SQL4 = Admin.part100name4.getText();
    static String name100SQL5 = Admin.part100name5.getText();
    static String name100SQL6 = Admin.part100name6.getText();
    static String name100SQLID = Admin.part100ID.getText();



    public SaveToDatabase(){



        PreparedStatement ps = null;
        PreparedStatement ps2 = null;
        Connection conn = null;



        String comboname = Admin.selectedInSaveDB;

        String query1 = "DELETE FROM  " + comboname + "  WHERE id = '1'";
        String query2 = "DELETE FROM  " + comboname + "  WHERE id = '2'";
        String query3 = "DELETE FROM  " + comboname + "  WHERE id = '3'";
        String query4 = "DELETE FROM  " + comboname + "  WHERE id = '4'";
        String query5 = "DELETE FROM  " + comboname + "  WHERE id = '5'";
        String query6 = "DELETE FROM  " + comboname + "  WHERE id = '6'";
        String query7 = "DELETE FROM  " + comboname + "  WHERE id = '7'";
        String query8 = "DELETE FROM  " + comboname + "  WHERE id = '8'";
        String query9 = "DELETE FROM  " + comboname + "  WHERE id = '9'";
        String query10 = "DELETE FROM  " + comboname + "  WHERE id = '10'";
        String query11 = "DELETE FROM  " + comboname + "  WHERE id = '11'";
        String query12 = "DELETE FROM  " + comboname + "  WHERE id = '12'";
        String query13 = "DELETE FROM  " + comboname + "  WHERE id = '13'";
        String query14 = "DELETE FROM  " + comboname + "  WHERE id = '14'";
        String query15 = "DELETE FROM  " + comboname + "  WHERE id = '15'";
        String query16 = "DELETE FROM  " + comboname + "  WHERE id = '16'";
        String query17 = "DELETE FROM  " + comboname + "  WHERE id = '17'";
        String query18 = "DELETE FROM  " + comboname + "  WHERE id = '18'";
        String query19 = "DELETE FROM  " + comboname + "  WHERE id = '19'";
        String query20 = "DELETE FROM  " + comboname + "  WHERE id = '20'";
        String query21 = "DELETE FROM  " + comboname + "  WHERE id = '21'";
        String query22 = "DELETE FROM  " + comboname + "  WHERE id = '22'";
        String query23 = "DELETE FROM  " + comboname + "  WHERE id = '23'";
        String query24 = "DELETE FROM  " + comboname + "  WHERE id = '24'";
        String query25 = "DELETE FROM  " + comboname + "  WHERE id = '25'";
        String query26 = "DELETE FROM  " + comboname + "  WHERE id = '26'";
        String query27 = "DELETE FROM  " + comboname + "  WHERE id = '27'";
        String query28 = "DELETE FROM  " + comboname + "  WHERE id = '28'";
        String query29 = "DELETE FROM  " + comboname + "  WHERE id = '29'";
        String query30 = "DELETE FROM  " + comboname + "  WHERE id = '30'";
        String query31 = "DELETE FROM  " + comboname + "  WHERE id = '31'";
        String query32 = "DELETE FROM  " + comboname + "  WHERE id = '32'";
        String query33 = "DELETE FROM  " + comboname + "  WHERE id = '33'";
        String query34 = "DELETE FROM  " + comboname + "  WHERE id = '34'";
        String query35 = "DELETE FROM  " + comboname + "  WHERE id = '35'";
        String query36 = "DELETE FROM  " + comboname + "  WHERE id = '36'";
        String query37 = "DELETE FROM  " + comboname + "  WHERE id = '37'";
        String query38 = "DELETE FROM  " + comboname + "  WHERE id = '38'";
        String query39 = "DELETE FROM  " + comboname + "  WHERE id = '39'";
        String query40 = "DELETE FROM  " + comboname + "  WHERE id = '40'";
        String query41 = "DELETE FROM  " + comboname + "  WHERE id = '41'";
        String query42 = "DELETE FROM  " + comboname + "  WHERE id = '42'";
        String query43 = "DELETE FROM  " + comboname + "  WHERE id = '43'";
        String query44 = "DELETE FROM  " + comboname + "  WHERE id = '44'";
        String query45 = "DELETE FROM  " + comboname + "  WHERE id = '45'";
        String query46 = "DELETE FROM  " + comboname + "  WHERE id = '46'";
        String query47 = "DELETE FROM  " + comboname + "  WHERE id = '47'";
        String query48 = "DELETE FROM  " + comboname + "  WHERE id = '48'";
        String query49 = "DELETE FROM  " + comboname + "  WHERE id = '49'";
        String query50 = "DELETE FROM  " + comboname + "  WHERE id = '50'";
        String query51 = "DELETE FROM  " + comboname + "  WHERE id = '51'";
        String query52 = "DELETE FROM  " + comboname + "  WHERE id = '52'";
        String query53 = "DELETE FROM  " + comboname + "  WHERE id = '53'";
        String query54 = "DELETE FROM  " + comboname + "  WHERE id = '54'";
        String query55 = "DELETE FROM  " + comboname + "  WHERE id = '55'";
        String query56 = "DELETE FROM  " + comboname + "  WHERE id = '56'";
        String query57 = "DELETE FROM  " + comboname + "  WHERE id = '57'";
        String query58 = "DELETE FROM  " + comboname + "  WHERE id = '58'";
        String query59 = "DELETE FROM  " + comboname + "  WHERE id = '59'";
        String query60 = "DELETE FROM  " + comboname + "  WHERE id = '60'";
        String query61 = "DELETE FROM  " + comboname + "  WHERE id = '61'";
        String query62 = "DELETE FROM  " + comboname + "  WHERE id = '62'";
        String query63 = "DELETE FROM  " + comboname + "  WHERE id = '63'";
        String query64 = "DELETE FROM  " + comboname + "  WHERE id = '64'";
        String query65 = "DELETE FROM  " + comboname + "  WHERE id = '65'";
        String query66 = "DELETE FROM  " + comboname + "  WHERE id = '66'";
        String query67 = "DELETE FROM  " + comboname + "  WHERE id = '67'";
        String query68 = "DELETE FROM  " + comboname + "  WHERE id = '68'";
        String query69 = "DELETE FROM  " + comboname + "  WHERE id = '69'";
        String query70 = "DELETE FROM  " + comboname + "  WHERE id = '70'";
        String query71 = "DELETE FROM  " + comboname + "  WHERE id = '71'";
        String query72 = "DELETE FROM  " + comboname + "  WHERE id = '72'";
        String query73 = "DELETE FROM  " + comboname + "  WHERE id = '73'";
        String query74 = "DELETE FROM  " + comboname + "  WHERE id = '74'";
        String query75 = "DELETE FROM  " + comboname + "  WHERE id = '75'";
        String query76 = "DELETE FROM  " + comboname + "  WHERE id = '76'";
        String query77 = "DELETE FROM  " + comboname + "  WHERE id = '77'";
        String query78 = "DELETE FROM  " + comboname + "  WHERE id = '78'";
        String query79 = "DELETE FROM  " + comboname + "  WHERE id = '79'";
        String query80 = "DELETE FROM  " + comboname + "  WHERE id = '80'";
        String query81 = "DELETE FROM  " + comboname + "  WHERE id = '81'";
        String query82 = "DELETE FROM  " + comboname + "  WHERE id = '82'";
        String query83 = "DELETE FROM  " + comboname + "  WHERE id = '83'";
        String query84 = "DELETE FROM  " + comboname + "  WHERE id = '84'";
        String query85 = "DELETE FROM  " + comboname + "  WHERE id = '85'";
        String query86 = "DELETE FROM  " + comboname + "  WHERE id = '86'";
        String query87 = "DELETE FROM  " + comboname + "  WHERE id = '87'";
        String query88 = "DELETE FROM  " + comboname + "  WHERE id = '88'";
        String query89 = "DELETE FROM  " + comboname + "  WHERE id = '89'";
        String query90 = "DELETE FROM  " + comboname + "  WHERE id = '90'";
        String query91 = "DELETE FROM  " + comboname + "  WHERE id = '91'";
        String query92 = "DELETE FROM  " + comboname + "  WHERE id = '92'";
        String query93 = "DELETE FROM  " + comboname + "  WHERE id = '93'";
        String query94 = "DELETE FROM  " + comboname + "  WHERE id = '94'";
        String query95 = "DELETE FROM  " + comboname + "  WHERE id = '95'";
        String query96 = "DELETE FROM  " + comboname + "  WHERE id = '96'";
        String query97 = "DELETE FROM  " + comboname + "  WHERE id = '97'";
        String query98 = "DELETE FROM  " + comboname + "  WHERE id = '98'";
        String query99 = "DELETE FROM  " + comboname + "  WHERE id = '99'";
        String query100 = "DELETE FROM  " + comboname + "  WHERE id = '100'";



            try {


            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            conn = DriverManager.getConnection("jdbc:odbc:Driver={Microsoft Access Driver (*.mdb, *.accdb)};DBQ=DB/Questions.mdb;");


                ps = conn.prepareStatement(query1);
                ps.execute();
                ps = conn.prepareStatement(query2);
                ps.execute();
                ps = conn.prepareStatement(query3);
                ps.execute();
                ps = conn.prepareStatement(query4);
                ps.execute();
                ps = conn.prepareStatement(query5);
                ps.execute();
                ps = conn.prepareStatement(query6);
                ps.execute();
                ps = conn.prepareStatement(query7);
                ps.execute();
                ps = conn.prepareStatement(query8);
                ps.execute();
                ps = conn.prepareStatement(query9);
                ps.execute();
                ps = conn.prepareStatement(query10);
                ps.execute();
                ps = conn.prepareStatement(query11);
                ps.execute();
                ps = conn.prepareStatement(query12);
                ps.execute();
                ps = conn.prepareStatement(query13);
                ps.execute();
                ps = conn.prepareStatement(query14);
                ps.execute();
                ps = conn.prepareStatement(query15);
                ps.execute();
                ps = conn.prepareStatement(query16);
                ps.execute();
                ps = conn.prepareStatement(query17);
                ps.execute();
                ps = conn.prepareStatement(query18);
                ps.execute();
                ps = conn.prepareStatement(query19);
                ps.execute();
                ps = conn.prepareStatement(query20);
                ps.execute();
                ps = conn.prepareStatement(query21);
                ps.execute();
                ps = conn.prepareStatement(query22);
                ps.execute();
                ps = conn.prepareStatement(query23);
                ps.execute();
                ps = conn.prepareStatement(query24);
                ps.execute();
                ps = conn.prepareStatement(query25);
                ps.execute();
                ps = conn.prepareStatement(query26);
                ps.execute();
                ps = conn.prepareStatement(query27);
                ps.execute();
                ps = conn.prepareStatement(query28);
                ps.execute();
                ps = conn.prepareStatement(query29);
                ps.execute();
                ps = conn.prepareStatement(query30);
                ps.execute();
                ps = conn.prepareStatement(query31);
                ps.execute();
                ps = conn.prepareStatement(query32);
                ps.execute();
                ps = conn.prepareStatement(query33);
                ps.execute();
                ps = conn.prepareStatement(query34);
                ps.execute();
                ps = conn.prepareStatement(query35);
                ps.execute();
                ps = conn.prepareStatement(query36);
                ps.execute();
                ps = conn.prepareStatement(query37);
                ps.execute();
                ps = conn.prepareStatement(query38);
                ps.execute();
                ps = conn.prepareStatement(query39);
                ps.execute();
                ps = conn.prepareStatement(query40);
                ps.execute();
                ps = conn.prepareStatement(query41);
                ps.execute();
                ps = conn.prepareStatement(query42);
                ps.execute();
                ps = conn.prepareStatement(query43);
                ps.execute();
                ps = conn.prepareStatement(query44);
                ps.execute();
                ps = conn.prepareStatement(query45);
                ps.execute();
                ps = conn.prepareStatement(query46);
                ps.execute();
                ps = conn.prepareStatement(query47);
                ps.execute();
                ps = conn.prepareStatement(query48);
                ps.execute();
                ps = conn.prepareStatement(query49);
                ps.execute();
                ps = conn.prepareStatement(query50);
                ps.execute();
                ps = conn.prepareStatement(query51);
                ps.execute();
                ps = conn.prepareStatement(query52);
                ps.execute();
                ps = conn.prepareStatement(query53);
                ps.execute();
                ps = conn.prepareStatement(query54);
                ps.execute();
                ps = conn.prepareStatement(query55);
                ps.execute();
                ps = conn.prepareStatement(query56);
                ps.execute();
                ps = conn.prepareStatement(query57);
                ps.execute();
                ps = conn.prepareStatement(query58);
                ps.execute();
                ps = conn.prepareStatement(query59);
                ps.execute();
                ps = conn.prepareStatement(query60);
                ps.execute();
                ps = conn.prepareStatement(query61);
                ps.execute();
                ps = conn.prepareStatement(query62);
                ps.execute();
                ps = conn.prepareStatement(query63);
                ps.execute();
                ps = conn.prepareStatement(query64);
                ps.execute();
                ps = conn.prepareStatement(query65);
                ps.execute();
                ps = conn.prepareStatement(query66);
                ps.execute();
                ps = conn.prepareStatement(query67);
                ps.execute();
                ps = conn.prepareStatement(query68);
                ps.execute();
                ps = conn.prepareStatement(query69);
                ps.execute();
                ps = conn.prepareStatement(query70);
                ps.execute();
                ps = conn.prepareStatement(query71);
                ps.execute();
                ps = conn.prepareStatement(query72);
                ps.execute();
                ps = conn.prepareStatement(query73);
                ps.execute();
                ps = conn.prepareStatement(query74);
                ps.execute();
                ps = conn.prepareStatement(query75);
                ps.execute();
                ps = conn.prepareStatement(query76);
                ps.execute();
                ps = conn.prepareStatement(query77);
                ps.execute();
                ps = conn.prepareStatement(query78);
                ps.execute();
                ps = conn.prepareStatement(query79);
                ps.execute();
                ps = conn.prepareStatement(query80);
                ps.execute();
                ps = conn.prepareStatement(query81);
                ps.execute();
                ps = conn.prepareStatement(query82);
                ps.execute();
                ps = conn.prepareStatement(query83);
                ps.execute();
                ps = conn.prepareStatement(query84);
                ps.execute();
                ps = conn.prepareStatement(query85);
                ps.execute();
                ps = conn.prepareStatement(query86);
                ps.execute();
                ps = conn.prepareStatement(query87);
                ps.execute();
                ps = conn.prepareStatement(query88);
                ps.execute();
                ps = conn.prepareStatement(query89);
                ps.execute();
                ps = conn.prepareStatement(query90);
                ps.execute();
                ps = conn.prepareStatement(query91);
                ps.execute();
                ps = conn.prepareStatement(query92);
                ps.execute();
                ps = conn.prepareStatement(query93);
                ps.execute();
                ps = conn.prepareStatement(query94);
                ps.execute();
                ps = conn.prepareStatement(query95);
                ps.execute();
                ps = conn.prepareStatement(query96);
                ps.execute();
                ps = conn.prepareStatement(query97);
                ps.execute();
                ps = conn.prepareStatement(query98);
                ps.execute();
                ps = conn.prepareStatement(query99);
                ps.execute();
                ps = conn.prepareStatement(query100);
                ps.execute();



//                String queryInsert1 = "INSERT INTO  " + comboname + " ( ID , Question , Option1 ,Option2 , Option3 , Option4 , Answer , Type ) VALUES (? , ? ,? , ?, ?, ?, ? , ?)";
//                String queryInsert2 = "INSERT INTO  " + comboname + " ( ID , Question , Option1 ,Option2 , Option3 , Option4 , Answer , Type ) VALUES (? , ? ,? , ?, ?, ?, ? , ?)";
//
//                ps = conn.prepareStatement (queryInsert1);
//                ps2 = conn.prepareStatement(queryInsert2);


                Statement statement = conn.createStatement();
                conn.setAutoCommit(false);

                String [] query1new = {
                        "INSERT INTO  " + comboname + " ( ID , Question , Option1 ,Option2 , Option3 , Option4 , Answer , Type ) VALUES ( '"+name1SQLID+"', '"+name1SQL+"' , '"+name1SQL2+"' , '"+name1SQL3+"', '"+name1SQL4+"', '"+name1SQL5+"', '"+name1SQL6+"' , 'radio')"
                };

                String [] query2new = {
                        "INSERT INTO  " + comboname + " ( ID , Question , Option1 ,Option2 , Option3 , Option4 , Answer , Type ) VALUES ( '"+name1SQLID+"', '"+name1SQL+"' , '"+name1SQL2+"' , '"+name1SQL3+"', '"+name1SQL4+"', '"+name1SQL5+"', '"+name1SQL6+"' , 'radio')",
                        "INSERT INTO  " + comboname + " ( ID , Question , Option1 ,Option2 , Option3 , Option4 , Answer , Type ) VALUES ( '"+name2SQLID+"', '"+name2SQL+"' , '"+name2SQL2+"' , '"+name2SQL3+"', '"+name2SQL4+"', '"+name2SQL5+"', '"+name2SQL6+"' , 'radio')",
                };















            if(Admin.count ==  1){


                for (String query : query1new) {
                    statement.addBatch(query);
                }
                statement.executeBatch();
                statement.close();


            }

            if(Admin.count == 2){


                for (String query : query2new) {
                    statement.addBatch(query);
                }
                statement.executeBatch();
                statement.close();

            }


//
//            if(Admin.count == 5){
//
//                ps.setString (1, "1");
//                ps.setString (2, name1SQL);
//
//                ps.executeUpdate();
//
//                ps.setString (1, "2");
//                ps.setString (2, name2SQL);
//
//                ps.executeUpdate();
//
//                ps.setString (1, "3");
//                ps.setString (2, name3SQL);
//
//                ps.executeUpdate();
//
//                ps.setString (1, "4");
//                ps.setString (2, name4SQL);
//
//                ps.executeUpdate();
//
//                ps.setString (1, "5");
//                ps.setString (2, name5SQL);
//
//                ps.executeUpdate();
//
//            }

                //Admin.dlog2.dispose();

                //Admin.go.setEnabled(false);
        }



        catch ( SQLException sqlException )
        {
            sqlException.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error in Uploading records", "FAILURE", JOptionPane.PLAIN_MESSAGE);
            Admin.go.setEnabled(true);
            //JOptionPane.showMessageDialog(null, "Please fill all fields!");

        } // end catch
        catch ( ClassNotFoundException classNotFound )
        {
            classNotFound.printStackTrace();

        } // end catch
        finally // ensure statement and connection are closed properly
        {
            try
            {
                ps.close();
                conn.commit();
                conn.close();
            } // end try
            catch ( Exception exception )
            {
                exception.printStackTrace();

            } // end catch
        } // end finally

//
//        Admin.part1name.setEditable(false);
//        Admin.part2name.setEditable(false);
//        Admin.part3name.setEditable(false);
//        Admin.part4name.setEditable(false);
//        Admin.part5name.setEditable(false);
//
//        Admin.up.setEnabled(false);
//        Admin.down.setEnabled(false);
//        Admin.retrieve.setEnabled(false);




    }




}
