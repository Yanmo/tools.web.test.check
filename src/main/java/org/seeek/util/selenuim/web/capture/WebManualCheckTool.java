package org.seeek.util.selenuim.web.capture;

import java.io.*;
import java.util.*;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import java.net.URL;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.cli.Options;  
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.ParseException;

import org.seeek.util.*;

import com.sun.jna.Platform;

public class WebManualCheckTool {

    public static void main(String[] args) throws Exception {

        CaptureOptions options = new CaptureOptions(args);
        CaptureWebPage capture = new CaptureWebPage(options);
        try {
            capture.start();
        } catch (Exception e) {
            e.printStackTrace(System.err);
            capture.destroy();
            throw e;
        }
        capture.destroy();
        System.out.println("capture finished!");
    }

}
